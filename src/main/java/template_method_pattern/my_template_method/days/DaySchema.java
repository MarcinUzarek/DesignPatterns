package template_method_pattern.my_template_method.days;

public abstract class DaySchema {

    public final void listDay(TransportType transportType) {
        wakeUp();
        breakfast();
        morningWC();
        goToWork(transportType);
        int work = work(0);
        summaryWork();
        getHome();
        hobby();
        goToSleep();
    }

    protected abstract void summaryWork();

    protected abstract int work(int hours);

    protected abstract void hobby();

    protected abstract void goToWork(TransportType transportType);

    protected abstract void goToSleep();

    protected abstract void getHome();

    private void morningWC(){
        System.out.println("I take a shower and clean my teeth");
    }

    protected abstract void breakfast();

    protected abstract void wakeUp();
}
