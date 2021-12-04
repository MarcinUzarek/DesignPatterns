package decorator_pattern.decorators;

import decorator_pattern.main_terrains.Terrain;

public class SwampDecorator extends TerrainDecorator{

    public SwampDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int getFuelCost() {
        return terrain.getFuelCost() + 15;
    }
}
