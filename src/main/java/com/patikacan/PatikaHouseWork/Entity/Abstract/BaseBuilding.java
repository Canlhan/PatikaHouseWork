package com.patikacan.PatikaHouseWork.Entity.Abstract;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class BaseBuilding
{
     private int squareMeters;
     private int price;
     private int numberOfRoom;
     private int numberOfLivingRoom;


}
