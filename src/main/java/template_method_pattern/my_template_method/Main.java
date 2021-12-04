package template_method_pattern.my_template_method;

import template_method_pattern.my_template_method.days.Friday;
import template_method_pattern.my_template_method.days.TransportType;
import template_method_pattern.my_template_method.days.WorkDay;
import template_method_pattern.template_method_example.car_sequence.ButtonCarStartingSequence;

public class Main {

    public static void main(String[] args) {

        var workDay = new WorkDay();
        workDay.listDay(TransportType.CAR);

        System.out.println();
        System.out.println("Friday:");
        var friday = new Friday();
        friday.listDay(TransportType.BIKE);
    }

}
