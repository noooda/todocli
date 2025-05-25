package io.github.noooda.todocli;

import java.util.Scanner;

public class TodoCli {
    private final TaskManager taskManager;
    private final Renderer renderer;
    private final String[] commands = { "add", "delete", "list", "exit" };

    public TodoCli(TaskManager taskManager, Renderer renderer) {
        this.taskManager = taskManager;
        this.renderer = renderer;
    }

    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            this.renderer.renderStartMessage(commands);

            while (true) {
                this.renderer.renderPrompt();
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    this.renderer.renderCommandError("");
                    continue;
                }

                String[] parts = input.split(" ", 2);
                String command = parts[0];

                if (command.equals("exit")) break;

                handleCommand(command, parts.length > 1 ? parts[1] : "");
            }
        }
    }

    private void handleCommand(String command, String argument) {
        switch (command) {
            case "list" -> list();
            case "add" -> handleAdd(argument);
            case "delete" -> handleDelete(argument);
            default -> this.renderer.renderCommandError(command);
        }
    }

    private void handleAdd(String description) {
        if (description.isBlank()) {
            this.renderer.renderInvalidDescription();
        } else {
            add(description);
        }
    }

    private void handleDelete(String id) {
        if (!isInteger(id)) {
            this.renderer.renderInvalidId();
        } else {
            delete(id);
        }
    }

    private void list() {
        this.renderer.renderTasks(this.taskManager.getTasks());
    }

    private void add(String description) {
        this.taskManager.addTask(description);
        list();
    }

    private void delete(String id) {
        this.taskManager.removeTask(Integer.parseInt(id));
        list();
    }

    private boolean isInteger(String str) {
        return str != null && str.matches("\\d+");
    }
}
