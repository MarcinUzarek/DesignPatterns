package template_method_pattern.template_method_example.car_sequence;

public abstract class CarStartingSequence {

    public final void startTheCar() {
        fastenTheSeatbealts();
        startTheEngine();
        setTheGear();
        go();
    }

    protected abstract void startTheEngine();
    protected abstract void setTheGear();

    private void go() {
        System.out.println("Wsciskamy pedał gazu");
    }

    private void fastenTheSeatbealts() {
        System.out.println("Zapinamy pasy");
    }


}
