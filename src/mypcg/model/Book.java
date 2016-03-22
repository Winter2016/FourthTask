package mypcg.model;

/**
 * Created by Ксения on 3/22/2016.
 */
public class Book {
    String title;
    double cost;
    String storehouse;
    int amount;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setStorehouse(String storehouse) {
        this.storehouse = storehouse;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }

    public String getStorehouse() {
        return storehouse;
    }

    public int getAmount() {
        return amount;
    }
}
