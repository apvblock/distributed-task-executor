package com.distributed.taskexecutor;

public class Main {

    public static void main(String[] args) {
        // Create a task executor with 4 worker threads
        TaskExecutor executor = new TaskExecutor(4);

        // Start the worker threads
        executor.startWorkers();

        // Submit some example tasks
        for (int i = 1; i <= 10; i++) {
            final int taskId = i;
            executor.submitTask(new Task("Task-" + taskId) {
                @Override
                public void execute() throws Exception {
                    // Simulate task execution
                    System.out.println("Processing " + getTaskId());
                    Thread.sleep(1000);  // Simulate long task
                }
            });
        }
    }
}
