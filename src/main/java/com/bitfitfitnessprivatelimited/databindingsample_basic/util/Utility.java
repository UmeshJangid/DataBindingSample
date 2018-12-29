package com.bitfitfitnessprivatelimited.databindingsample_basic.util;

/**
 * Created on Android Studio
 * Author: Umesh
 * DATE: 12/28/2018
 * TIME :7:27 PM.
 * DAY: Friday
 * Project: DataBindingSample_Basic
 */
public class Utility {
    public static String getEmployeeIdString(int quantity) {
        return ("Emp_ID: " + String.valueOf(quantity));
    }

    public static String convertIntToString(int value) {
        return ("(" + String.valueOf(value) + ")");
    }

    // https://stackoverflow.com/questions/9769554/how-to-convert-number-into-k-thousands-m-million-and-b-billion-suffix-in-jsp
    // Converts the number to K, M suffix
    // Ex: 5500 will be displayed as 5.5k
    public static String convertToSuffix(long count) {
        if (count < 1000) return "" + count;
        int exp = (int) (Math.log(count) / Math.log(1000));
        return String.format("%.1f%c",
                count / Math.pow(1000, exp),
                "kmgtpe".charAt(exp - 1));
    }

}
