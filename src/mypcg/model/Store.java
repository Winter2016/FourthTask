package mypcg.model;

/**
 * Created by Ксения on 3/22/2016.
 */
public class Store {
    String name;
    String region;
    double commission;

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public double getCommission() {
        return commission;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
