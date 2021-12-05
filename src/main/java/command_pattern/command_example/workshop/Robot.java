package command_pattern.command_example.workshop;

public class Robot {

    public void turnOn() {
        System.out.println("Robot został włączony!");
    }

    public void cut() {
        System.out.println("Robot tnie!");
    }

    public void drill() {
        System.out.println("Robot wierci!");
    }

    public void turnoff() {
        System.out.println("Robot wyłączony");
    }
}
