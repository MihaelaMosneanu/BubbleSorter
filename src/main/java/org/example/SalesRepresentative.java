package org.example;

public class SalesRepresentative {
    private String name;
    private int sales;
    private int quota;
    private int revenue;

    public SalesRepresentative(String name, int sales, int quota) {
        this.name = name;
        this.sales = sales;
        this.quota = quota;
        this.revenue= sales * quota;
    }
    public int getRevenue() {

        return revenue;
    }

    @Override
    public String toString() {

        return name + ": " + getRevenue() + "$";
    }
}
