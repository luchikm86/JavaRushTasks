package com.javarush.task.task03.task0318;

/*
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader InputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(InputStreamReader);


        String year = bufferedReader.readLine();
        int upYear = Integer.parseInt(year);
        String name = bufferedReader.readLine();


        System.out.println(name + " захватит мир через " + upYear + " лет. Му-ха-ха!");

    }
}
