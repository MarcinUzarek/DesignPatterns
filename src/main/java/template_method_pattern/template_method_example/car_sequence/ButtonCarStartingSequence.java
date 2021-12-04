package template_method_pattern.template_method_example.car_sequence;

public class ButtonCarStartingSequence extends ClassicCarStartingSequence{

    @Override
    protected void startTheEngine() {
        System.out.println("Nacisnij guzik zeby wystartowac");
    }
}
