package com.rhys.designpatterns.builder;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/22 2:19 上午
 */
public class Main {
    public static void main(String[] args) {
        TerrainBuilder builder = new ComplexTerrainBuilder();
        Terrain terrain = builder.builderFort().builderMine().builderWall().build();

        Person person = new Person.PersonBuilder()
                .basicInfo(1, "RhysNi", 25)
                .score(20)
                .weight(120.4)
                .location("上丰路", "3082")
                .build();
        System.out.println(person);
    }
}
