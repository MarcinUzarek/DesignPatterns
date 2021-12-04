package decorator_pattern.decorators;

import decorator_pattern.main_terrains.Terrain;

public class ForrestDecorator extends TerrainDecorator {

    public ForrestDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int getFuelCost() {
        return terrain.getFuelCost() + 5;
    }
}
