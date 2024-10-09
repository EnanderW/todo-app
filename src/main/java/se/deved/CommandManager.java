package se.deved;

public class CommandManager {

    public static void tryExecuteCommand(String input) {
        String[] commandArgs = input.split(" ");

        if (commandArgs.equals("help")) {

        } else if (commandArgs.equals("stop")) {

        } else if (commandArgs.equals("create")) {

        }
    }
}
