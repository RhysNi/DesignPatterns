package com.rhys.designpatterns.builder;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/22 2:15 上午
 */
public interface TerrainBuilder {
    TerrainBuilder builderWall();

    TerrainBuilder builderFort();

    TerrainBuilder builderMine();

    Terrain build();
}
