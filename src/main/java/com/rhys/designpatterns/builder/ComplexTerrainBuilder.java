package com.rhys.designpatterns.builder;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/22 2:15 上午
 */
public class ComplexTerrainBuilder implements TerrainBuilder {
    Terrain terrain = new Terrain();

    @Override
    public TerrainBuilder builderWall() {
        terrain.wall = new Wall(10, 10, 50, 50);
        return this;
    }

    @Override
    public TerrainBuilder builderFort() {
        terrain.fort = new Fort(10, 10, 50, 50);
        return this;
    }

    @Override
    public TerrainBuilder builderMine() {
        terrain.mine = new Mine(10, 10, 50, 50);
        return this;
    }

    @Override
    public Terrain build() {
        return terrain;
    }
}
