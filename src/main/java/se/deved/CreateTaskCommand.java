package se.deved;

import java.util.Scanner;

public class CreateTaskCommand {

    public static void run(String[] commandArgs) {
        if (commandArgs.length != 2) {
            return;
        }

        Scanner scanner = new Scanner(System.in);

        String title = commandArgs[1];
        String description = scanner.nextLine();

        Task task = new Task();
        task.title = title;
        task.description = description;
    }
}
