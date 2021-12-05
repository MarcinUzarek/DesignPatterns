package command_pattern.command_example.workshop.command;

import command_pattern.command_example.workshop.Robot;

public class RobotTurnOffCommand implements Command{

    private Robot robot;

    public RobotTurnOffCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.turnoff();
    }

    @Override
    public void unDo() {
        robot.turnOn();
    }
}
