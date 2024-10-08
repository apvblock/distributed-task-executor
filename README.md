# Distributed Task Executor

This project implements a distributed task execution system using Java. It supports parallel task execution with a task queue and multiple worker threads.

## Features

- Submit tasks to a task queue.
- Multiple worker threads that process tasks in parallel.
- Handles exceptions in task execution.
- Simple simulation of distributed computing.

## Requirements

- Java 8 or higher.
- Maven for building the project.

## How to Build and Run

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/distributed-task-executor.git
    cd distributed-task-executor
    ```

2. Build the project with Maven:
    ```bash
    mvn clean install
    ```

3. Run the application:
    ```bash
    mvn exec:java -Dexec.mainClass="com.distributed.taskexecutor.Main"
    ```

## Example Output

```bash
Executing task: Task-1
Processing Task-1
Executing task: Task-2
Processing Task-2
Executing task: Task-3
Processing Task-3
...
