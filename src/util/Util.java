package util;

import model.Driver;
import model.FareInfo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Util {
    public static boolean validateEmail(String email){
        Pattern pattern = Pattern.compile("^.+@.+\\..+$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isNumeric(String string) {
        int intValue;
        if(string == null || string.equals("")) {
            return false;
        }
        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static FareInfo readFareInfo(String path){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String[] infoStrArr = reader.readLine().split(",");
            if(!isNumeric(infoStrArr[0]) || !isNumeric(infoStrArr[1]) || !isNumeric(infoStrArr[2])){
                return null;
            } else{
                Integer traveledDistance = Integer.valueOf(infoStrArr[0]);
                Integer traveledUnit = Integer.valueOf(infoStrArr[1]);
                Integer costPerDisTraveled = Integer.valueOf(infoStrArr[2]);
                return new FareInfo(traveledDistance, traveledUnit, costPerDisTraveled);
            }
        }  catch (IOException e) {
            return null;
        }
    }

    public static int fareCalculation(int baseFarePrice, int baseFareDistance, int traveledDistance, int traveledUnit, int costPerDisTraveled){
        // Distance Traveled Units
        int disTraveledUnit =  traveledDistance - baseFareDistance;

        // Fare = Base Fare Price + (Distance Traveled Units * Cost Per Distance Traveled)
        if(disTraveledUnit <= 0){
            return baseFarePrice;
        }
        disTraveledUnit = (int) Math.ceil((double)disTraveledUnit / traveledUnit);
        return baseFarePrice + (disTraveledUnit * costPerDisTraveled);
    }

    public static int getCheapestFare(List<Driver> driverList, FareInfo fareInfo) {
        if(driverList== null || driverList.size() <= 0 || fareInfo == null){
            return -1;
        }
        int cheapestFareCost = Integer.MAX_VALUE;
        for (Driver driver : driverList) {
            int fareCost = fareCalculation(driver.getBaseFarePrice(), driver.getBaseFareDistance(), fareInfo.getTraveledDistance(), fareInfo.getTraveledUnit(), fareInfo.getCostPerDisTraveled());
            if (fareCost < cheapestFareCost){
                cheapestFareCost = fareCost;
            }
        }
        return cheapestFareCost;
    }
}
