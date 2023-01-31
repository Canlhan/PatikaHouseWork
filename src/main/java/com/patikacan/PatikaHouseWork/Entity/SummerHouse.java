package com.patikacan.PatikaHouseWork.Entity;

import com.patikacan.PatikaHouseWork.Entity.Abstract.BaseBuilding;
import com.patikacan.PatikaHouseWork.Entity.Abstract.IBuilding;

public class SummerHouse extends BaseBuilding implements IBuilding
{
    public SummerHouse(int squareMeters, int price, int numberOfRoom, int numberOfLivingRoom) {
        super(squareMeters, price, numberOfRoom, numberOfLivingRoom);
    }

    @Override
    public String toString() {

        return "SummerHouse{" +super.toString()+"}";
    }
}
