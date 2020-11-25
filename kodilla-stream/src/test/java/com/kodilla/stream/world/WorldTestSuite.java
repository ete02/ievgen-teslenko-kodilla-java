package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given

        // quantity is made up
        //Asia (
        Country country1 = new Country("India", new BigDecimal("135470272"));
        Country country2 = new Country("China", new BigDecimal("1330044605"));
        Country country3 = new Country("Japan", new BigDecimal("1147996000"));

        //Europe
        Country country4 = new Country("Poland", new BigDecimal("37971231"));
        Country country5 = new Country("Norway", new BigDecimal("5433543"));
        Country country6 = new Country("France", new BigDecimal("66997647"));

        //South America
        Country country7 = new Country("Brazil", new BigDecimal("209429773"));
        Country country8 = new Country("Argentina", new BigDecimal("44491231"));
        Country country9 = new Country("Peru", new BigDecimal("31991231"));

        List<Country> asiaList = new ArrayList<>();
        asiaList.add(country1);
        asiaList.add(country2);
        asiaList.add(country3);

        List<Country> europeList = new ArrayList<>();
        europeList.add(country4);
        europeList.add(country5);
        europeList.add(country6);

        List<Country> southAmericaList = new ArrayList<>();
        southAmericaList.add(country7);
        southAmericaList.add(country8);
        southAmericaList.add(country9);

        Continent asia = new Continent(asiaList);
        Continent europe = new Continent(europeList);
        Continent southAmerica = new Continent(southAmericaList);

        List<Continent> worldList = new ArrayList<>();
        worldList.add(asia);
        worldList.add(europe);
        worldList.add(southAmerica);

        World world = new World(worldList);

        //When

        BigDecimal peopleAllAroundTheWorld = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("3009825533"), peopleAllAroundTheWorld);

    }
}