package io.github.noooda.todocli;

import java.util.LinkedHashMap;
import java.util.Map;

public class TaskManager {
    private int CURRENT_ID = 0;
    private final Map<Integer, String> tasks;

    public TaskManager() {
        this.tasks = new LinkedHashMap<>();
    }

    public Map<Integer, String> getTasks() {
        return new LinkedHashMap<>(tasks);
    }

    public void addTask(String description) {
        tasks.put(++CURRENT_ID, description);
    }

    public void removeTask(int id) {
        this.tasks.remove(id);
    }
}
