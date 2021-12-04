package template_method_pattern.template_method_example.car_sequence;

public class ClassicCarStartingSequence extends CarStartingSequence {

    @Override
    protected void startTheEngine() {
        System.out.println("Odpalamy silnik");
    }

    @Override
    protected void setTheGear() {
        System.out.println("Wrzucamy bieg");
    }


}
