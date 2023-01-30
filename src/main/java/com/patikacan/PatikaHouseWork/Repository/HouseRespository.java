package com.patikacan.PatikaHouseWork.Repository;

import com.patikacan.PatikaHouseWork.Entity.Abstract.BaseBuilding;
import com.patikacan.PatikaHouseWork.Entity.House;

import java.util.List;

public interface HouseRespository<T extends BaseBuilding>
{
    List<T> getAll();
     List<T> createBuilding();
}
