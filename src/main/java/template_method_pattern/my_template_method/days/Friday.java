package template_method_pattern.my_template_method.days;

public class Friday extends WorkDay{

    @Override
    protected void hobby() {
        System.out.println("I meet my friends");
    }

    @Override
    protected void breakfast() {
        System.out.println("Scrambled eggs for breakfast");
    }

}
