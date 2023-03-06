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
        return getExponentiations(start,stop,step,2);
    }

    public static String getRange(int start) {
        return getRange(0,start,1);
    }

    public static String getRange(int start, int stop) {
        return getRange(start,stop,1);
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
