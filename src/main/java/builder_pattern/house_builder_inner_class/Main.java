package builder_pattern.house_builder_inner_class;

public class Main  {
    public static void main(String[] args) {

        House house = new House.HouseBuilder()
                .buildFloors("wooden")
                .buildDoors("wooden")
                .buildWalls("black")
                .buildRooms("5")
                .builWindows("2 per room")
                .buildGarage("10 square meters")
                .build();



        System.out.println(house);






    }
}

