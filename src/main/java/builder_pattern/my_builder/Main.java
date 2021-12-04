package builder_pattern.my_builder;

public class Main {
    public static void main(String[] args) {

        FlightLeg leg = new FlightLeg.FlightBuilder()
                .buildFrom("Poland")
                .buildTo("Spain")
                .buildPrice(100)
                .build();

        leg.setPrice(200);
        leg.setDelayed(true);

        System.out.println(leg);


    }
}