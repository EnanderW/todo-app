package se.deved;

public class CommandManager {

    public static void tryExecuteCommand(String input) {
        String[] commandArgs = input.split(" ");

        if (commandArgs.equals("help")) {
            HelpCommand.run(commandArgs);
        } else if (commandArgs.equals("stop")) {

        } else if (commandArgs.equals("create")) {

        }
    }
}
