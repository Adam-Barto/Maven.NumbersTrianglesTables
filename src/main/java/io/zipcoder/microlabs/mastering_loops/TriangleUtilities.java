package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {


    public static String getTriangle(int numberOfRows) {
        StringBuilder line = new StringBuilder();
        int i = 1;
        while (i < numberOfRows) {
            line.append(getRow(i));
            line.append("\n");
            i= i + 1;
        }
        return line.toString();
    }

    public static String getRow(int numberOfStars) {
            int i = 1;
            StringBuilder line = new StringBuilder();
            while (i <= numberOfStars){
                line.append("*");
                i = i+1;
            }
            return line.toString();
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
