package io.github.noooda.todocli;

import java.util.List;
import java.util.ArrayList;


public class TaskManager {
    List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public List<Task> addTask(String description) {
        int lastId = tasks.isEmpty() ? 0 : tasks.get(tasks.size() - 1).getId();
        Task task = new Task(lastId+1, description);
        tasks.add(task);
        return tasks;
    }
}
