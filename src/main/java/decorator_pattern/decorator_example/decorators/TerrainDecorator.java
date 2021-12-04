package decorator_pattern.decorator_example.decorators;

import decorator_pattern.decorator_example.main_terrains.Terrain;

public class TerrainDecorator extends Terrain {

    protected Terrain terrain;

    public TerrainDecorator(Terrain terrain) {
        super("", 0);
        this.terrain = terrain;
    }
}
