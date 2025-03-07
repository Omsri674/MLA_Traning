package com.mla.test;

public class Order {
    private int id;
    private  String name;
    private int price;
    private int month;
    private int year;
    private String city;
    private String categy;
    private int qty;
    private int cost = price * qty;

    public Order() {
    }

    public Order(int id, String name, int price, int month, int year, String city, String categy, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.month = month;
        this.year = year;
        this.city = city;
        this.categy = categy;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCategy() {
        return categy;
    }

    public void setCategy(String categy) {
        this.categy = categy;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", month=" + month +
                ", year=" + year +
                ", city='" + city + '\'' +
                ", categy='" + categy + '\'' +
                ", qty=" + qty + '\'' +
                ", cost=" + cost +
                '}';
    }

    public int getCost(){
        return cost;
    }
}
