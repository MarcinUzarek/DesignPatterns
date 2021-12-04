package builder_pattern.builder_lombok;

public class Main {
    public static void main(String[] args) {

        var house = House.builder()
                .doors("doors")
                .floors("floor")
                .garage("garage")
                .roof("roof")
                .windows("windows");

        System.out.println(house);
    }
}
