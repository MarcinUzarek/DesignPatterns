package builder_pattern.house_builder_interface;

public class Main {
    public static void main(String[] args) {

        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);

        smallHouseDirector.buildHouse();
        bigHouseDirector.buildHouse();

        House smallHouse = smallHouseDirector.getHouse();
        House bigHouse = bigHouseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);
    }
}
