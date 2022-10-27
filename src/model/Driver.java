package model;

public class Driver {
    private String name;
    private String surname;
    private String email;
    private String vehicleType;
    private Integer baseFarePrice;
    private Integer baseFareDistance;

    public Driver() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getBaseFarePrice() {
        return baseFarePrice;
    }

    public void setBaseFarePrice(Integer baseFarePrice) {
        this.baseFarePrice = baseFarePrice;
    }

    public Integer getBaseFareDistance() {
        return baseFareDistance;
    }

    public void setBaseFareDistance(Integer baseFareDistance) {
        this.baseFareDistance = baseFareDistance;
    }
}
