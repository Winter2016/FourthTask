package mypcg.model;

/**
 * Created by Ксения on 3/22/2016.
 */
public class Client {
    String surname;
    String region;
    double discount;

    public String getSurname() {
        return surname;
    }

    public String getRegion() {
        return region;
    }

    public double getDiscount() {
        return discount;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
