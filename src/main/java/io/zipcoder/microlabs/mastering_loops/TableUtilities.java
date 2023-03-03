package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {

    private static StringBuilder getRow(int n, int size){
        int i = 1;
        StringBuilder line = new StringBuilder();
            while (i <= size){
                ;
                line.append(String.format("%5s", (n * i) + " |"));
                i = i+1;
             }
            return line;
    }
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder line = new StringBuilder();
        int i = 1;
        while (i <= tableSize) {
            line.append(getRow(i,tableSize));
            line.append("\n");
            i= i + 1;
        }
        return line.toString();
    }
}
