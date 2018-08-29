package com.lizuibai.androidtool;

public class M {

    public static int toInt(String input, int def) {
        try {
            int value = Integer.parseInt(input);
            return value;
        } catch (Throwable e) {

        }
        return def;
    }

    public static float toFloat(String input, float def) {
        try {
            float value = Integer.parseInt(input);
            return value;
        } catch (Throwable e) {

        }
        return def;
    }

}
