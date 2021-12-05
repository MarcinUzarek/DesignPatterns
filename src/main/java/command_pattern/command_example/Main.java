package command_pattern.command_example;

import command_pattern.command_example.workshop.Robot;
import command_pattern.command_example.workshop.WorkShopApp;
import command_pattern.command_example.workshop.command.RobotTurnOnCommand;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        WorkShopApp workShopApp = new WorkShopApp();


        workShopApp.addtoQueue(new RobotTurnOnCommand(robot));
        workShopApp.run();
        workShopApp.unDoLastCommand();



    }
}
