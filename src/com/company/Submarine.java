package com.company;

public class Submarine extends Vehicle implements Comparable<Vehicle>{

    private int maxDepth;

    public Submarine()
    {
        super();
        maxDepth = 1000;
    }

    public Submarine(String color, int year, int maxDepth)
    {
        super(color, year);
        this.maxDepth = maxDepth;
    }

    public boolean equals(Object obj)
    {
        Submarine otherSub = (Submarine) obj;
        return super.equals(otherSub) && (this.maxDepth==otherSub.maxDepth);
    }

    @Override
    public String toString() {

        return super.toString() + ", Max Depth = " + maxDepth;
    }

    public int compareTo(Submarine other)
    {
        return this.maxDepth - other.maxDepth;
    }
}
