package io.github.noooda.todocli;

import java.util.Scanner;
import java.util.List;


public class TodoCli {
    TaskManager taskManager;

    public TodoCli(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Todo CLI started.\n");
        System.out.println("Available commands");
        System.out.println("| add | delte | list | exit |\n");

        while (true) {
            System.out.print("> ");
            command = scanner.nextLine();

            if (command.equals("add")) {
                System.out.print("Enter task description: ");
                String description = scanner.nextLine();
                this.taskManager.addTask(description);
            }

            if (command.equals("exit")) break; 

            System.out.println(this.taskManager.getTasks());
            // } else if (command.equals("list")) {
            //     listTasks();
            // } else if (command.equals("remove")) {
            //     System.out.print("Enter task ID to remove: ");
            //     int id = Integer.parseInt(scanner.nextLine());
            //     removeTask(id);
            // } else if (command.equals("exit")) {
            //     break;
            // } else {
            //     System.out.println("Unknown command. Try again.");
            // }
        }

        scanner.close();
    }
}
