package decorator_pattern.decorator_example.main_terrains;

import lombok.Getter;

@Getter
public abstract class Terrain {

    private String description;
    private int fuelCost;

    public Terrain(String description, int fuelCost) {
        this.description = description;
        this.fuelCost = fuelCost;
    }

}
