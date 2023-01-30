package com.patikacan.PatikaHouseWork.Service;

import com.patikacan.PatikaHouseWork.Entity.Abstract.BaseBuilding;
import com.patikacan.PatikaHouseWork.Entity.House;
import com.patikacan.PatikaHouseWork.Entity.SummerHouse;
import com.patikacan.PatikaHouseWork.Entity.Villa;

import java.util.List;

public interface BuildingService
{
    public  int getPriceTotalOfHouse();
    public  int getPriceTotalOfVilla();
    public  int getPriceTotalOfSummerHouse();
    int getTotalPriceOfAllBuilding();

    double getAverageSquareMetersOfAllBuildings();

    double getAverageSquareMetersOfHouse();
    double getAverageSquareMetersOfVillas();
    double getAverageSquareMetersOfSummerHouse();



}
