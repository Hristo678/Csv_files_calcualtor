package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<Double> numbers = new ArrayList<>();
        double sum = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("files/ExampleData_1.csv"));
            String line = "";
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] elements = line.split(",");
                numbers.add(Double.parseDouble(elements[3]));
                sum += Double.parseDouble(elements[3]);

            }

            double median = 0.0;
            int numbersSize = numbers.size();

            if (numbersSize % 2 ==0){
                 median = (numbers.get(numbersSize / 2 )  + numbers.get(numbersSize / 2 - 1)) / 2;

            }else {

                median = numbers.get((int)Math.ceil(numbersSize / 2));
            }
            System.out.println(sum / numbersSize);
            System.out.println(median);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("No such file!");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
