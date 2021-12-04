package template_method_pattern.template_method_example.car_sequence;

public class AutomaticTransmitionStartingSequence extends ClassicCarStartingSequence{

    @Override
    protected void setTheGear() {
        System.out.println("Automat");
    }
}
