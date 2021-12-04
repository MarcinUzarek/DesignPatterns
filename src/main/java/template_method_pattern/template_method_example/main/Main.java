package template_method_pattern.template_method_example.main;

import template_method_pattern.template_method_example.car_sequence.AutomaticTransmitionStartingSequence;
import template_method_pattern.template_method_example.car_sequence.ButtonCarStartingSequence;
import template_method_pattern.template_method_example.car_sequence.ClassicCarStartingSequence;

public class Main {

    public static void main(String[] args) {

        var automaticTransmitionStartingSequence = new AutomaticTransmitionStartingSequence();
        var classicCarStartingSequence = new ClassicCarStartingSequence();
        var buttonCarStartingSequence = new ButtonCarStartingSequence();

        automaticTransmitionStartingSequence.startTheCar();
        System.out.println();
        classicCarStartingSequence.startTheCar();
        System.out.println();
        buttonCarStartingSequence.startTheCar();
    }
}
