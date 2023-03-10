package com.patikacan.PatikaHouseWork.Service;

import com.patikacan.PatikaHouseWork.Entity.Abstract.BaseBuilding;
import com.patikacan.PatikaHouseWork.Entity.Abstract.IBuilding;
import com.patikacan.PatikaHouseWork.Entity.House;
import com.patikacan.PatikaHouseWork.Entity.SummerHouse;
import com.patikacan.PatikaHouseWork.Entity.Villa;
import com.patikacan.PatikaHouseWork.Repository.Abstract.HomeRepository;
import com.patikacan.PatikaHouseWork.Repository.Abstract.SummerHouseRepository;
import com.patikacan.PatikaHouseWork.Repository.Abstract.VillaRepository;
import com.patikacan.PatikaHouseWork.Repository.Concrete.HouseRepositoryImpl;
import com.patikacan.PatikaHouseWork.Repository.Concrete.VillaRepositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BuildingManager implements BuildingService{


    private final HomeRepository homeRepository;
    private final VillaRepository villaRepository;
    private final SummerHouseRepository summerHouseRepository;

    public BuildingManager() {
        this.homeRepository = new HouseRepositoryImpl();
        this.villaRepository = new VillaRepositoryImpl();
        this.summerHouseRepository = new com.patikacan.PatikaHouseWork.Repository.Concrete.SummerHouseRepository();
    }

    @Override
    public int getPriceTotalOfHouse() {

        List<House> houses=getHouses();
        return getPrices(houses);
    }

    @Override
    public int getPriceTotalOfVilla() {

        List<Villa> villas=getVillas();

        return getPrices(villas);
    }

    @Override
    public int getPriceTotalOfSummerHouse() {
        List<SummerHouse> summerHouses=getSummerHouses();

        return getPrices(summerHouses);
    }

    @Override
    public int getTotalPriceOfAllBuilding() {
        List<House> houses=getHouses();
        List<Villa> villas=getVillas();
        List<SummerHouse> summerHouse=getSummerHouses();

        return getPrices(houses)
                +getPrices(summerHouse)
                +getPrices(villas);
    }

    @Override
    public double getAverageSquareMetersOfAllBuildings() {
        List<House> houses=getHouses();
        List<Villa> villas=getVillas();
        List<SummerHouse> summerHouse=getSummerHouses();

        return (getSquareMeter(houses)+getSquareMeter(villas)+getSquareMeter(summerHouse))
                /(houses.size()+villas.size()+summerHouse.size());
    }

    @Override
    public double getAverageSquareMetersOfHouse() {
        List<House> houses=getHouses();
        return getSquareMeter(houses)/houses.size();
    }

    @Override
    public double getAverageSquareMetersOfVillas() {
        List<Villa> villas=getVillas();
        return getSquareMeter(villas)/villas.size();
    }

    @Override
    public double getAverageSquareMetersOfSummerHouse() {
        List<SummerHouse> summerHouse=getSummerHouses();
        return getSquareMeter(summerHouse)/summerHouse.size();
    }

    @Override
    public void searchBuilding(int numberOfRoom, int numberOfRestRoom) {

        ArrayList<BaseBuilding> allBuilding=new ArrayList<>();
        allBuilding.addAll(getHouses());
        allBuilding.addAll(getVillas());
        allBuilding.addAll(getSummerHouses());

        var resultOfSearch=allBuilding.stream().filter(building->building.getNumberOfLivingRoom()==numberOfRestRoom && building.getNumberOfRoom()==numberOfRoom)
                .collect(Collectors.toList());
        if(resultOfSearch.size()>0){
            System.out.println(" there is  "+resultOfSearch.size()+" according to criteria you want");
        }
        System.out.println(resultOfSearch);

    }


    private   <T extends BaseBuilding> int getPrices(List<T> buildings){

        int totalPriceOfBuildings=0;

        for (T building : buildings) {
            totalPriceOfBuildings+=building.getPrice();
        }
        return totalPriceOfBuildings;
    }
    private   <T extends BaseBuilding> int getSquareMeter(List<T> buildings){

        int totalSquareMeterOfBuildings=0;

        for (T building : buildings) {
            totalSquareMeterOfBuildings+=building.getSquareMeters();
        }
        return totalSquareMeterOfBuildings;
    }


    private List<House> getHouses(){
        return homeRepository.getAll();
    }
    private List<Villa> getVillas(){
        return villaRepository.getAll();
    }
    private List<SummerHouse> getSummerHouses(){
       return summerHouseRepository.getAll();
    }
}
