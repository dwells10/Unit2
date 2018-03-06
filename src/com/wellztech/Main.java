package com.wellztech;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
	    //csv Comma seperated values.

        String fileName = "date_diff.csv";
        File file = new File(fileName);

        try {

            Scanner inputStream = new Scanner(file);
            while (inputStream.hasNext()){

                String data = inputStream.nextLine();
                System.out.println(data);


            }

            inputStream.close();

        } catch (FileNotFoundException e){

            e.printStackTrace();

        }



        Date today = new Date();
        String line;
        String Fields[];




    }
}
