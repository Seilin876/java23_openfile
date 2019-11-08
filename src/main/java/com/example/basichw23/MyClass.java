package com.example.basichw23;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class MyClass {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\USER\\AndroidStudioProjects\\MyApplication\\basicHW23\\data.txt");//自己電腦的路徑
            File fileHW = new File("data.txt");//繳交作業路徑

            FileInputStream readIn = new FileInputStream(file);
            //FileInputStream readIn = new FileInputStream(fileHW);
            InputStreamReader read = new InputStreamReader(readIn, "UTF-8" );
            BufferedReader bufferedReader = new BufferedReader(read);
            String oneLine = null;
            while ((oneLine = bufferedReader.readLine()) != null) {
                System.out.println(oneLine);
            }
            read.close();
        }
        catch (Exception e) {
            System.out.println("讀取文件內容出錯");
            e.printStackTrace();
        }
    }
}