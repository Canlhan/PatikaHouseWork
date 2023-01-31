package com.patikacan.PatikaHouseWork;

import com.patikacan.PatikaHouseWork.Entity.Abstract.BaseBuilding;
import com.patikacan.PatikaHouseWork.Entity.House;
import com.patikacan.PatikaHouseWork.Entity.Villa;
import com.patikacan.PatikaHouseWork.Service.BuildingManager;
import com.patikacan.PatikaHouseWork.Service.BuildingService;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Console
{
    public static void main(String[] args) {

        BuildingService service=new BuildingManager();
        System.out.println("total price of Houses: "+service.getPriceTotalOfHouse());
        System.out.println("total price of Villas: "+service.getPriceTotalOfVilla());
        System.out.println("total price of SummerHouse: "+service.getPriceTotalOfSummerHouse());

        System.out.println("total price of All building: "+service.getTotalPriceOfAllBuilding());
        System.out.println("Average square meters of houses: "+service.getAverageSquareMetersOfHouse());
        System.out.println("Average square meters of Villas: "+service.getAverageSquareMetersOfVillas());
        System.out.println("Average square meters of SummerHouse: "+service.getAverageSquareMetersOfSummerHouse());

        System.out.println("Average square meters of all building: "+service.getAverageSquareMetersOfAllBuildings());


        System.out.println("searching...");
        service.searchBuilding(4,3);
        System.out.println("searching finished");

    }
}
