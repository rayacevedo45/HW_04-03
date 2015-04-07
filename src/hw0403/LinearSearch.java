package hw0403;

import java.util.ArrayList;

/**
 * Access Code 2.1
 * Ray Acevedo
 * LinearSearch.java
 */
public class LinearSearch
{
    public static void main(String[] args)
    {
        //Test Arraylist
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(3);
        arrayList.add(45);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(99);
    }

    public static int linearSearch(ArrayList<Integer> arrayList, int targetElement)
    {
        Integer r = arrayList.indexOf(targetElement);
        return r;
    }
}
