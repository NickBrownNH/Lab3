package com.company;

public class Main {

    public static void main(String[] args) {
//        //Chap 10 Polymorphism
//
//        Vehicle v1;
//        if ((int) Math.random()*2 == 0)
//            v1 = new Sportscar();
//        else
//            v1 = new Submarine();
//        System.out.println(v1);  //binds v1's toString() method using dynamic binding
//
//        //array of Vehicle objects filled with either Submarines or Sportscars
//        Vehicle[] vehicles = new Vehicle[100];
//        int i = 0;
//        for (i=0; i< vehicles.length; i++)
//        {
//            /*
//            if ((int) Math.random()*2 == 0)
//                vehicles[i] = new Sportscar();
//            else
//                vehicles[i] = new Submarine();
//
//             */
//            vehicles[i] = (int) Math.random()*2 == 0 ? new Sportscar() : new Submarine();
//        }
//
//        float a = (1==0) ? (float) 2.5 : (float)3.4;
//
//        Vehicle v10;
//        v10 = new Vehicle();
//        v10 = new Sportscar();
//        v10 = new Submarine();

        //test insertion sort
        Vehicle[] fleet = new Vehicle[5];
        fleet[0] = new Vehicle ("white", 2000);
        fleet[1] = new Vehicle ("red", 2020);
        fleet[2] = new Vehicle ("white", 2000);
        fleet[3] = new Vehicle ("silver", 2030);
        fleet[4] = new Vehicle ("black", 2010);

        //sort the fleet
        Sort.insertionSort(fleet);

        //print array of vehicles
        printArray(fleet);

        Double[] nums = {5.2, 6.1, 2.0, 4.88, 1.57};
        Double d = 1.5;  //auto-boxing example, from primitive type to object

        VehicleList vl = new VehicleList(200000);
        System.out.println(vl.toString());
        System.out.println("Selection sort time: " + vl.MeasureSelectionsSortTime());

        System.out.println("Selection sort time (Sorted): " + vl.MeasureSelectionsSortSortedTime());

        System.out.println("Insertion sort time: " + vl.MeasureInsertionSortTime());


        System.out.println("Insertion sort time (Sorted): " + vl.MeasureInsertionSortSortedTime());
        //Sort.selectionSort(nums);
        //System.out.println(Search.linearSearch(nums, 1.58, 1, 3));
        //System.out.println(Search.linearSearch(nums, 4.0));

        //test linear search on Vehicle array
        //System.out.println(Search.linearSearch(fleet, new Vehicle("black", 2010)));

        //test binary search on Vehicle array
        //System.out.println(Search.binarySearch(fleet, new Vehicle("black", 2010)));

    }
    public static void printArray(Comparable[] list)
    {
        for (int i=0; i<list.length; i++)
            System.out.println(list[i]);
    }
}
