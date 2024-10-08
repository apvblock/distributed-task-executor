package com.distributed.taskexecutor;

import java.util.ArrayList;
import java.util.List;

public class TaskExecutor {
    private List<WorkerThread> workerThreads;
    private TaskQueue taskQueue;
    private int numberOfWorkers;

    public TaskExecutor(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
        taskQueue = new TaskQueue();
        workerThreads = new ArrayList<>();
    }

    public void startWorkers() {
        for (int i = 0; i < numberOfWorkers; i++) {
            WorkerThread worker = new WorkerThread(taskQueue);
            workerThreads.add(worker);
            worker.start();
        }
    }

    public void submitTask(Task task) {
        taskQueue.addTask(task);
    }
}
