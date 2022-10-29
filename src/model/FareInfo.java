package model;

public class FareInfo {
    private Integer traveledDistance;
    private Integer traveledUnit;
    private Integer costPerDisTraveled;
    private Integer fareCost;

    public FareInfo(Integer traveledDistance, Integer traveledUnit, Integer costPerDisTraveled) {
        this.traveledDistance = traveledDistance;
        this.traveledUnit = traveledUnit;
        this.costPerDisTraveled = costPerDisTraveled;
    }

    // getter
    public Integer getTraveledDistance() {
        return traveledDistance;
    }

    public Integer getTraveledUnit() {
        return traveledUnit;
    }

    public Integer getCostPerDisTraveled() {
        return costPerDisTraveled;
    }

    public Integer getFareCost() {
        return fareCost;
    }

    // setter
    public void setFareCost(Integer fareCost) {
        this.fareCost = fareCost;
    }
}
