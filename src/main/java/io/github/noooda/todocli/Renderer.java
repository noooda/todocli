package io.github.noooda.todocli;

import java.util.Map;

public class Renderer {
    private static final String PROMPT = "\n>> ";
    private static final String START_MESSAGE = "\nTodo CLI started.\nAvailable commands below:\n";
    private static final String SEPARATOR = "------------------------------";

    public void renderStartMessage(String[] commands) {
        System.out.println(START_MESSAGE);
        System.out.println(SEPARATOR);
        System.out.print("| ");
        for (String command : commands) {
            System.out.print(command + " | ");
        }
        System.out.println("\n" + SEPARATOR);
    }

    public void renderPrompt() {
        System.out.print(PROMPT);
    }

    public void renderTasks(Map<Integer, String> tasks) {
        tasks.forEach((key, value) -> System.out.println("\n" + key + ": " + value));
    }

    public void renderCommandError(String command) {
        System.out.println("Unknown command: " + command);
    }

    public void renderInvalidDescription() {
        System.out.println("Task description cannot be null or blank.");
    }

    public void renderInvalidId() {
        System.out.println("Invalid task ID.");
    }
}
