package decorator_pattern.decorator_example.decorators;

import decorator_pattern.decorator_example.main_terrains.Terrain;

public class ForrestDecorator extends TerrainDecorator {

    public ForrestDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int getFuelCost() {
        return terrain.getFuelCost() + 5;
    }
}
