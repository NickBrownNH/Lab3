package com.company;

public class Sort {
    public static void selectionSort(Comparable[] list)
    {
        int minIndex;
        Comparable temp;

        for (int pass = 0; pass<list.length-1; pass++)
        {
            //find the smallest beginning at index pass
            minIndex = pass;   //initially assume that the first value is the minimum
            for (int scan = pass+1; scan < list.length ; scan++)
                if (list[minIndex].compareTo(list[scan]) > 0)
                    minIndex = scan;

            //swap if needed, swap contents of list at minIndex and pass
            if (pass != minIndex)
            {
                temp = list[pass];
                list[pass] = list[minIndex];
                list[minIndex] = temp;
            }
        }
    }

    public static void insertionSort(Comparable[] list)
    {
        Comparable key;
        int scan;

        for (int pass = 1; pass<list.length; pass++)
        {
            //identify the key;
            key = list[pass];

            //insert the key into the sorted part of the list
            //shifting larger values to the right
            scan = pass;
            while (scan > 0 && key.compareTo(list[scan-1]) < 0)
            {
                list[scan] = list[scan-1];
                scan--;
            }
            list[scan] = key;
        }
    }
}
