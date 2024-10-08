package com.distributed.taskexecutor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskQueue {
    private BlockingQueue<Task> taskQueue;

    public TaskQueue() {
        taskQueue = new LinkedBlockingQueue<>();
    }

    public void addTask(Task task) {
        try {
            taskQueue.put(task);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public Task getTask() {
        try {
            return taskQueue.take();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public boolean isEmpty() {
        return taskQueue.isEmpty();
    }
}
