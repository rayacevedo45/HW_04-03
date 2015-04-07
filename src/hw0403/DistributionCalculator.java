package hw0403;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Access Code 2.1
 * Ray Acevedo
 * DistributionCalculator.java
 */
//Create a class to calculate the distribution of characters in the contents of a text file.
//Your class called DistributionCalculator should implement a method calculate(File textFile)
//which accepts as input a Text file. It reads the contents of the file and returns an
//ArrayList which contains the distribution/percentage of characters (a-z) in the text file.
//You should lowercase lines before you do the calculation. Call the calculate method from
//main and print the distribution. You can ignore characters which do not belong in the
//range(a-z) for doing your calculation. Your program's output should look something like:
//
//        a = 14.44 %
//        b = 6.02 %
//        ...
//
//        z = 0.05 %


public class DistributionCalculator
{

    public static ArrayList<Double> calculate(File textFile) throws FileNotFoundException
    {

        ArrayList<Double> percentage = new ArrayList<Double>();
        int totalNumbersOfLetters = 0;
        HashMap<Character, Integer> percentageTable = new HashMap<Character, Integer>();
        for(int i = 0; i < 26; i++)
        {
            percentageTable.put((char) (i + 97), 0);
        }
        Scanner input = new Scanner(textFile);
        String word;
        while(input.hasNext())
        {
            word = input.next();

            for(int i = 0; i < word.length(); i++)
            {
                char c = word.toLowerCase().charAt(i);
                if(Character.isLetter(c))
                {
                    percentageTable.put(c, percentageTable.get(c) + 1);
                    totalNumbersOfLetters++;

                }
            }
        }
        for(int count : percentageTable.values())
        {
            double percentagee = (double) (count * 100) / totalNumbersOfLetters;
            percentage.add(percentagee);
        }
        return percentage;
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("/Users/c4q-raynaldie/Desktop/accesscode/HW_04-03/moby dick.txt");
        ArrayList<Double> list = calculate(file);
        System.out.println(list);
    }
}