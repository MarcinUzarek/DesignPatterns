package builder_pattern.my_builder;

import lombok.ToString;

@ToString
public class FlightLeg {

    private String from;
    private String to;
    private boolean delayed = false;
    private int price;

    private FlightLeg(FlightBuilder flightBuilder) {
        this.from = flightBuilder.from;
        this.to = flightBuilder.to;
        this.price = flightBuilder.price;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static class FlightBuilder {

        private String from;
        private String to;
        private boolean delayed = false;
        private int price;


        public FlightLeg build() {
            if(this.price==0) {
                throw new IllegalStateException("Brak wymaganego pola - cena");
            }
            return new FlightLeg(this);
        }


        public FlightBuilder buildFrom(String from) {
            this.from = from;
            return this;
        }
        public FlightBuilder buildTo(String to) {
            this.to = to;
            return this;
        }
        public FlightBuilder buildPrice(int price) {
            this.price = price;
            return this;
        }
    }
}
