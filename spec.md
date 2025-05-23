# Functional Requirements: CLI ToDo List Application

## Overview

This application is a command-line interface (CLI) program written in Java.
It allows users to manage a simple ToDo list with features to add, delete, and list tasks.
The program will use Java’s `ArrayList` or `HashMap` for data storage and manipulation.

## Requirements

### 1. Add Task

#### Command
`add [task description]`

#### Description
Adds a new task with the provided description.

#### validation
- Rejects empty descriptions.
- Auto-generates a unique task ID (if using `HashMap`).

### 2. Delete Task

#### Command
`delete [task ID or index]`

#### Description
Deletes the task corresponding to the provided task ID (if using `HashMap`) or index (if using `ArrayList`).

#### validation
- Verifies that the task ID/index exists.
- Provides a meaningful error if the task is not found.

### 3. List Tasks

#### Command
`list`

#### Description
Displays all tasks in the list.

#### Output Format 
- If using `ArrayList`: Index + Description
- If using `HashMap`: ID + Description


### 4. Exit Application

#### Command
`exit`

#### Description
Safely terminates the application.

## Additional Considerations
- The application should run in a loop, waiting for user input until the `exit` command is issued.
- Tasks are stored in memory (no persistence across runs is required).
- Handle unexpected input gracefully with user-friendly error messages.

## Example Session
```
> add Buy groceries
Task added.

> add Finish homework
Task added.

> list
[0] Buy groceries
[1] Finish homework

> delete 0
Task deleted.

> list
[0] Finish homework

> exit
```