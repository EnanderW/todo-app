package se.deved;

import java.util.Scanner;

public class CreateTaskCommand {

    public static void run(String[] commandArgs) {
        Scanner scanner = new Scanner(System.in);

        String title = commandArgs[1];
        String description = scanner.nextLine();
    }
}
