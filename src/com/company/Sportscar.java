package com.company;

public class Sportscar extends Vehicle implements Comparable<Vehicle>{

    private boolean aspirated;

    public Sportscar() {
        super();
        aspirated = false;
    }

    public Sportscar(String color, int year, boolean aspiration) {
        super(color, year);
        this.aspirated = aspiration;
    }

    @Override
    public String toString() {

        return super.toString() + ", Aspiration = " + aspirated;
    }

    public void move() {
        System.out.println("VROOOM");
    }

    public int compareTo(Sportscar other)
    {
        //return this.aspirated - other.aspirated;  //cannot subtract booleans

        if (this.aspirated == other.aspirated)
            return 0;
        else if (this.aspirated)
            return 1;
        else
            return -1;
    }
}
