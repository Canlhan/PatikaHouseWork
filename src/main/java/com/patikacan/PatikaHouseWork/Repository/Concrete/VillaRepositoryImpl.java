package com.patikacan.PatikaHouseWork.Repository.Concrete;

import com.patikacan.PatikaHouseWork.Entity.Villa;
import com.patikacan.PatikaHouseWork.Repository.Abstract.VillaRepository;

import java.util.ArrayList;
import java.util.List;

public class VillaRepositoryImpl implements VillaRepository {


    @Override
    public List<Villa> getAll() {
        return createBuilding();
    }

    @Override
    public List<Villa> createBuilding() {

        List<Villa> villas=new ArrayList<>();
        villas.add(new Villa(250,1_000_000,8,4));
        villas.add(new Villa(450,2_000_000,5,6));
        villas.add(new Villa(550,5_000_000,10,6));

        return villas;
    }
}
