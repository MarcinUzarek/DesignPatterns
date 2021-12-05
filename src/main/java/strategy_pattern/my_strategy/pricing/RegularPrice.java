package strategy_pattern.my_strategy.pricing;

public class RegularPrice implements PricingStrategy{

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsLetter) {
        if (isSignedUpForNewsLetter) {
            System.out.println("Wybrana zła strategia");
        } else {
            System.out.println("Cena towaru to: " + (price) );
        }
    }
}
