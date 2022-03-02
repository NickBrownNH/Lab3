package com.company;

public class Search {

    /**
     * Implements linear search on a search pool
     * @param list the search pool
     * @param target the object to search
     * @return the index of target in the array if found, -1 if not found
     */
    public static int linearSearch (Comparable[] list, Comparable target)
    {
        return linearSearch(list, target,0, list.length-1);
    }

    public static int linearSearch (Comparable[] list, Comparable target,
                                    int start, int end)
    {
        int index = start;
        boolean found = false;
        while (!found && index <= end)
        {
            if (list[index].compareTo(target) == 0)
                found = true;
            else
                index++;
        }
//        if (found)   // or if (index == list.length)
//            return index;
//        else
//            return -1;
        return found ? index : -1;
    }

    /**
     * Implements binary search
     * @param list sorted array of Comparable objects
     * @param target the object to search
     * @return the index of target in the array if found, -1 if not found
     */
    public static int binarySearch (Comparable[] list, Comparable target)
    {
        int min=0, max=list.length-1, mid = 0;
        boolean found = false;
        int result;

        while (!found && min <= max)
        {
            //calculate mid
            mid = (min+max)/2;

            //check if item at mid is the target, if so, target is found
            //if not, adjust either min or max
            result = list[mid].compareTo(target);
            if (result == 0)
                found = true;
            else if (result > 0)
                max = mid - 1;
            else
                min = mid + 1;
        }
        return found ? mid : -1;
    }
}
