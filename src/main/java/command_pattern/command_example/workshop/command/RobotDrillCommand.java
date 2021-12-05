package command_pattern.command_example.workshop.command;

import command_pattern.command_example.workshop.Robot;

public class RobotDrillCommand implements Command{

    private Robot robot;

    public RobotDrillCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.drill();
    }

    @Override
    public void unDo() {

    }
}
