package com.patikacan.PatikaHouseWork.Repository.Concrete;

import com.patikacan.PatikaHouseWork.Entity.SummerHouse;

import java.util.ArrayList;
import java.util.List;


public class SummerHouseRepository implements com.patikacan.PatikaHouseWork.Repository.Abstract.SummerHouseRepository {

    @Override
    public List<SummerHouse> getAll() {
        return createBuilding();
    }

    @Override
    public List<SummerHouse> createBuilding() {

        List<SummerHouse> summerHouses=new ArrayList<>();
        summerHouses.add(new SummerHouse(120,3_000_000,2,1));
        summerHouses.add(new SummerHouse(200,2_000_000,4,3));
        summerHouses.add(new SummerHouse(150,1_500_000,3,2));

        return summerHouses;
    }
}
