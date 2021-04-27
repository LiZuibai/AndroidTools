package com.lizuibai.util;

import org.json.JSONArray;

import java.util.ArrayList;

public class JSONUtil {

    public static String getFirstElement(JSONArray array) {
        if (array == null || array.length() <= 0) {
            return "";
        }
        return String.valueOf(array.opt(0));
    }

    public static ArrayList<String> arrayToStringList(JSONArray array) {
        ArrayList<String> list = new ArrayList<>();
        if (array == null || array.length() <= 0) {
            return list;
        }
        for (int i = 0; i < array.length(); i++) {
            list.add(String.valueOf(array.opt(i)));
        }
        return list;
    }
}
