package decorator_pattern.decorators;

import decorator_pattern.main_terrains.Terrain;

public class TerrainDecorator extends Terrain {

    protected Terrain terrain;

    public TerrainDecorator(Terrain terrain) {
        super("", 0);
        this.terrain = terrain;
    }
}
