package com.distributed.taskexecutor;

public class WorkerThread extends Thread {
    private TaskQueue taskQueue;

    public WorkerThread(TaskQueue taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        while (true) {
            Task task = taskQueue.getTask();
            if (task != null) {
                try {
                    System.out.println("Executing task: " + task.getTaskId());
                    task.execute();
                    System.out.println("Task " + task.getTaskId() + " completed.");
                } catch (Exception e) {
                    System.err.println("Error executing task " + task.getTaskId() + ": " + e.getMessage());
                }
            }
        }
    }
}
