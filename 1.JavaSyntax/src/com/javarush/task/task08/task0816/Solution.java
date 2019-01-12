package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        map.put("Michael", df.parse("JULY 2 1965"));
        map.put("Nikolson", df.parse("JANUARY 30 1986"));
        map.put("Padre", df.parse("AUGUST 13 1962"));
        map.put("Ivanov", df.parse("JUNE 5 1954"));
        map.put("Petrov", df.parse("SEPTEMBER 19 1987"));
        map.put("Sidorov", df.parse("MAY 26 1978"));
        map.put("Shnider", df.parse("OCTOBER 2 1965"));
        map.put("Stoks", df.parse("APRIL 2 1980"));
        map.put("Gross", df.parse("JULY 20 1984"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            String month = pair.getValue().toString();
            if (month.contains("Jun") || month.contains("Jul") || month.contains("Aug")) {
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}
