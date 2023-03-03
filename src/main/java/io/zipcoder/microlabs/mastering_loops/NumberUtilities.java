package io.zipcoder.microlabs.mastering_loops;


import java.lang.reflect.Array;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder list = new StringBuilder();
        for(int i = start; i < stop; i++){
            if (i % 2 != 0)
                 list.append(i);
        }

        return list.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder list = new StringBuilder();
        for(int i = start; i < stop; i++){
            if (i % 2 == 0)
                list.append(i);
        }
        return list.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder list = new StringBuilder();
        for(int i = start; i < stop; i=(i+step)){
                list.append((int)Math.pow(i,2));
        }
        return list.toString();
    }

    public static String getRange(int start) {
        StringBuilder list = new StringBuilder();
        for(int i = 0; i < start; i++){
                list.append(i);
        }
        return list.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder list = new StringBuilder();
        for(int i = start; i < stop; i++){
            list.append(i);
        }
        return list.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder list = new StringBuilder();
        for(int i = start; i < stop; i=i+step){
            list.append(i);
        }
        return list.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder list = new StringBuilder();
        for(int i = start; i < stop; i=i+step){
            list.append((int)Math.pow(i,exponent));
        }
        return list.toString();
    }
}
