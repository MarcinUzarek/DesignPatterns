package strategy_pattern.my_strategy.pricing;

public interface PricingStrategy {

    void calculatePrice(int price, boolean isSignedUpForNewsLetter);
}
