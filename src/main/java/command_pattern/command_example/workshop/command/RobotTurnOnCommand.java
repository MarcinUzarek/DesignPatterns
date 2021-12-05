package command_pattern.command_example.workshop.command;

import command_pattern.command_example.workshop.Robot;

public class RobotTurnOnCommand implements Command{

    private Robot robot;

    public RobotTurnOnCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.turnOn();
    }

    @Override
    public void unDo() {
        robot.turnoff();
    }


}
