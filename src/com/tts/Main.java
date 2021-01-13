package com.tts;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] exampleArray = {1, 5, 6, 5, 4, 1};

        // Question 1

        int sum = 0; // initialize sum
        int j;

        // Iterate through all elements and add them to sum
        for (j = 0; j < exampleArray.length; j++)
            sum += exampleArray[j];

        System.out.println(sum);


        // Question 2
        //    double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i < exampleArray.length; i++) {

            if (exampleArray[i] > maximum) {

                maximum = exampleArray[i];

                index = i;
            }
        }
        System.out.println(index);

        // Question 3

        double[] result = toPower(4, 2);
        System.out.println(Arrays.toString(result));

    }
        public static double[] toPower(int size, int power) {
        double[] result = new double[size];
        for(int i = 0; i < size; i++) {
            result[i] = Math.pow((double) i, Double.valueOf(power));
        }
        return result;
    }
}
