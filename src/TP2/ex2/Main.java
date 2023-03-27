package TP2.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] data = new String[12];
        int index =0;
        try{
            File myObj = new File("files\\TP2\\BusinessFinancialData.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data[index] = myReader.nextLine();
                data[index]+="\r\n";
                index++;
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("a) ");
        for(int i=0; i< data.length; i++){
            System.out.println(data[i]);
        }
        System.out.println();

        System.out.println("b) ");
        for(int i=0; i< data.length; i++){
            String[] fields = data[i].split(",");
            System.out.println("\tCode: " + fields[0]);
            System.out.println("\tValeur totale: " + fields[2]);
            System.out.println("\tCode: " + fields[4]);
            System.out.println();
        }


    }
}