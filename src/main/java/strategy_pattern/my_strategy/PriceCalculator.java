package strategy_pattern.my_strategy;

import strategy_pattern.my_strategy.pricing.PricingStrategy;

public class PriceCalculator {

     private PricingStrategy pricingStrategy;

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void calculate(int price, boolean isSignedUpForNewsLetter) {
       pricingStrategy.calculatePrice(price, isSignedUpForNewsLetter);
    }
}
