package template_method_pattern.my_template_method.days;

import template_method_pattern.my_template_method.days.DaySchema;
import template_method_pattern.my_template_method.days.TransportType;

public class WorkDay extends DaySchema {

    @Override
    protected void summaryWork() {
        System.out.println("I work " + work(8));
    }

    @Override
    protected int work(int hours) {
        return 8;
    }

    @Override
    protected void hobby() {
        System.out.println("I go training");
    }

    @Override
    protected void goToWork(TransportType transportType) {
        System.out.println("I go to work by " + transportType);
    }

    @Override
    protected void goToSleep() {
        System.out.println("I go to sleep at 02:00");
    }

    @Override
    protected void getHome() {
        System.out.println("I get home at 20");
    }

    @Override
    protected void breakfast() {
        System.out.println("Sandwiches for breakfast");
    }

    @Override
    protected void wakeUp() {
        System.out.println("I wake up at 10");
    }
}
