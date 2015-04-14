package hw0403;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

    public static int[] calculate(File textFile)
    {
        int[] result = new int[26];

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(textFile));
            String line;


            while((line = br.readLine()) != null)
            {
                String lowerLine = line.toLowerCase();
                for (int i = 0; i < lowerLine.length(); i++){
                    char letter = lowerLine.charAt(i);
                    //System.out.println(letter);
                    int letterValue = (int)letter-97;
                    if (letterValue >= 0 && letterValue <= 25){
                        result[letterValue] = result[letterValue] + 1;
                    }

                }
            }

        }
        catch(IOException q)
        {
            System.out.println("Error reading file");
        }

        int totalNumOfLetters = 0;
        for (int i = 0; i < result.length; i++)
        { totalNumOfLetters = totalNumOfLetters + result[i];

        }
        for (int i = 0; i < result.length; i++)
        {
            System.out.println("" + (char)(i
                    +97 )+" "+ ((double)100*result[i]/totalNumOfLetters)+"%");

        }return result;
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("/Users/c4q-raynaldie/Desktop/accesscode/HW_04-03/moby dick.txt");
        int[] result = calculate(file);


        }

}