package io.github.noooda.todocli;


public class Task {
    final int id;
    final String description;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }
    
}
