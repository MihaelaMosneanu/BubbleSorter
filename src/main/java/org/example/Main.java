package org.example;

public class Main {


    public static void main(String[] args) {
        BubbleSorter bubbleSorter = new BubbleSorter();
        SalesRepresentative[] representatives = {
                new SalesRepresentative("John", 10, 500),
                new SalesRepresentative("Mike", 7, 800),
                new SalesRepresentative("Lisa", 12, 400),
                new SalesRepresentative("Sarah", 8, 700),
        };
        SalesRepresentative[] sortedRepresentatives = bubbleSorter.sort(representatives);
        System.out.println("Sorted representatives:");
        for (SalesRepresentative rep : sortedRepresentatives) {
            System.out.println(rep);
        }
    }
}