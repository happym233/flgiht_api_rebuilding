package project;

import project.Controllers.Controller;
import project.Controllers.ControllerFactory;
import project.Gateway.SqliteConnector;

import java.util.Scanner;

public class FlightAPIApplication {
    private Controller controller;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while (!command.equals("q")) {
            System.out.print("Input your command(\"q\" to quit) > ");
            command = scanner.next();
            if (command.equalsIgnoreCase("q") || command.equalsIgnoreCase("quit") || command.equalsIgnoreCase("exit"))
                break;;
            System.out.println(handleCommand(command));
        }
        SqliteConnector.close();
    }

    private String handleCommand(String command) {
        String[] splits = command.split("\\?");
        String url, param;
        if (splits.length > 3) {
            return "Illegal command.";
        } else if (splits.length == 0) {
            return "Illegal command.";
        } else if (splits.length == 1) {
            url = splits[0];
            controller = ControllerFactory.create(url);
            if (controller == null) return "Unknown url.";
            return controller.handleParameter("");
        } else {
            url = splits[0];
            param = splits[1];
            controller = ControllerFactory.create(url);
            if (controller == null) return "Unknown url.";
            return controller.handleParameter(param);
        }
    }
}
