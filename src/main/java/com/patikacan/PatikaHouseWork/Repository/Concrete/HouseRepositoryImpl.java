package com.patikacan.PatikaHouseWork.Repository.Concrete;

import com.patikacan.PatikaHouseWork.Entity.House;
import com.patikacan.PatikaHouseWork.Repository.Abstract.HomeRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class HouseRepositoryImpl implements HomeRepository {





    @Override
    public List<House> getAll() {


        return createBuilding();
    }

    @Override
    public List<House> createBuilding() {

        List<House> houses=new ArrayList<>();
        houses.add(new House(40,50_000,4,3));
        houses.add(new House(70,90_000,2,1));
        houses.add(new House(80,60_000,5,2));

        return houses;

    }


}
