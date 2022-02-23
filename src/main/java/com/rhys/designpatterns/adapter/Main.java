package com.rhys.designpatterns.adapter;

import java.io.*;

/**
 * @author Rhys.Ni
 * @version 1.0
 * @date 2022/2/22 2:40 上午
 */
public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/rhys/xxx.text");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = bufferedReader.readLine();
        while (line != null && !line.equals("")) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
