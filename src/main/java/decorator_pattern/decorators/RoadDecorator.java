package decorator_pattern.decorators;

import decorator_pattern.main_terrains.Terrain;

public class RoadDecorator extends TerrainDecorator{

    public RoadDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public String getDescription() {
        return terrain.getDescription() + " with road";
    }

    @Override
    public int getFuelCost() {
        return terrain.getFuelCost() - 10;
    }
}
