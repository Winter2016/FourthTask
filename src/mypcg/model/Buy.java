package mypcg.model;

import java.util.Date;

/**
 * Created by Ксения on 3/22/2016.
 */
public class Buy {
    java.util.Date buy_date;
    Store store;
    Client client;
    Book book;
    int amount;
    double cost;

    public Date getBuy_date() {
        return buy_date;
    }

    public Store getStore() {
        return store;
    }

    public Client getClient() {
        return client;
    }

    public Book getBook() {
        return book;
    }

    public int getAmount() {
        return amount;
    }

    public double getCost() {
        return cost;
    }

    public void setBuy_date(Date buy_date) {
        this.buy_date = buy_date;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
