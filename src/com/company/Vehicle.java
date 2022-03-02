package com.company;

public class Vehicle implements Comparable<Vehicle>{
    protected String color;
    private int year;

    public Vehicle () {
        this("White", 2022);
    }

    public Vehicle (String color, int year) {
        this.color = color;
        this.year = year;
    }

    public String toString() {
        return "Color is " + color + ", Year is " + year;
    }

    final public void paint(String newColor)
    {
        color = newColor;
    }

    @Override
    public boolean equals(Object obj)
    {
        Vehicle other = (Vehicle) obj;

        //version 1
//        if (this.color.equals(other.color) && this.year==other.year)  //call to equals() here is String's equals()
//            return true;
//        else
//            return false;

        //version 2
        return this.color.equals(other.color) && this.year==other.year;
    }

    public int compareTo(Vehicle other)
    {
      return this.year - other.year;
    }
}