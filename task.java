package com.distributed.taskexecutor;

public abstract class Task {
    private String taskId;

    public Task(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskId() {
        return taskId;
    }

    // Abstract method to be implemented by concrete tasks
    public abstract void execute() throws Exception;
}
