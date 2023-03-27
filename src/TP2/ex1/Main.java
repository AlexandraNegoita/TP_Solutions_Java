package TP2.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String data = "";
        int index = 1;
        try{
            File myObj = new File("files\\TP2\\BusinessFinancialData.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine() && index != 4) {
                data = myReader.nextLine();
                index++;
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("a) ");
        System.out.println("\t"+data.indexOf("Business"));
        System.out.println();
        System.out.println("b) ");
        System.out.println("\t"+data.lastIndexOf(" "));
        System.out.println();
        System.out.println("c) ");
        String[] fields = data.split(",");
        System.out.println("\tCode: " + fields[0]);
        System.out.println("\tValeur totale: " + fields[2]);
        System.out.println("\tCode: " + fields[4]);
    }
}