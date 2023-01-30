package com.patikacan.PatikaHouseWork;

import com.patikacan.PatikaHouseWork.Entity.Abstract.BaseBuilding;
import com.patikacan.PatikaHouseWork.Entity.House;
import com.patikacan.PatikaHouseWork.Entity.Villa;
import com.patikacan.PatikaHouseWork.Service.BuildingManager;
import com.patikacan.PatikaHouseWork.Service.BuildingService;

import java.util.ArrayList;
import java.util.List;

public class Console
{
    public static void main(String[] args) {

        BuildingService service=new BuildingManager();

        System.out.println(service.getPriceTotalOfSummerHouse());

    }
}
