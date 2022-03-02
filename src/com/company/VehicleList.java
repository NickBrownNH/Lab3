package com.company;

import java.util.Arrays;

public class VehicleList {

    private Vehicle[] Vs;
    String VehicleString = "";

    public VehicleList (int size) {
        int decider;
        String[] colors = {"white", "red", "blue", "black"};
        int maxDepth;  //1 to 500
        int year;//2000 to 2030
        boolean aspirated = false;
        Vs = new Vehicle[size];
        String[] VsChecker;


        for (int i = 0; i < Vs.length; i++) {

            decider = (int)(Math.random()*2);
            maxDepth = (int) ((Math.random()*500) + 1);
            year = (int) ((Math.random()*30)+2000);
            String color = colors[(int)(Math.random()*colors.length)];

            if ((int)(Math.random()*2)==1)
                aspirated = true;

            if (decider == 0) {
                Vs[i] = new Sportscar(color, year, aspirated);
            } else {
                Vs[i] = new Submarine(color, year, maxDepth);
            }
            VehicleString = VehicleString + "\n" + Vs[i];
        }
    }

    public long MeasureSelectionsSortTime () {
        long firstTime = System.nanoTime();
        Sort.selectionSort(Vs);
        long secondTime = System.nanoTime();
        return (secondTime - firstTime);
    }

    public long MeasureInsertionSortTime () {
        long firstTime = System.nanoTime();
        Sort.insertionSort(Vs);
        long secondTime = System.nanoTime();
        return (secondTime - firstTime);
    }


    public long MeasureSelectionsSortSortedTime () {
        Sort.selectionSort(Vs);
        long firstTime = System.nanoTime();
        Sort.selectionSort(Vs);
        long secondTime = System.nanoTime();
        return (secondTime - firstTime);
    }

    public long MeasureInsertionSortSortedTime () {
        Sort.insertionSort(Vs);
        long firstTime = System.nanoTime();
        Sort.insertionSort(Vs);
        long secondTime = System.nanoTime();
        return (secondTime - firstTime);
    }


    public long SearchLinearTime () {
        long firstTime = System.nanoTime();
        Search.linearSearch(Vs, 0);
        long secondTime = System.nanoTime();
        return (secondTime - firstTime);
    }

    public long SearchBinaryTime () {
        long firstTime = System.nanoTime();
        Search.binarySearch(Vs,0);
        long secondTime = System.nanoTime();
        return (secondTime - firstTime);
    }



    @Override
    public String toString() {
        return VehicleString;
    }
}
