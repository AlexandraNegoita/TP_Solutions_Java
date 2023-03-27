package TP2.ex5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Pattern pattern;
        Matcher matcher;
        boolean matchFound;
        for(int i=0; i< data.length; i++){
//            String[] fields = data[i].split(",");
            pattern = Pattern.compile("BDCQ.SF1[A-Z]+[0-9]+CA", Pattern.CASE_INSENSITIVE);
            matcher = pattern.matcher(data[i]);
            matchFound = matcher.find();
            if(matchFound) {
                System.out.println("\tCode: " + matcher.group());
            } else {
                System.out.println("Code for no."+ i +" not found");
            }

            pattern = Pattern.compile(",[0-9]+.[0-9]*,", Pattern.CASE_INSENSITIVE);
            matcher = pattern.matcher(data[i]);
            matchFound = matcher.find();
            if(matchFound) {
                System.out.println("\tValeur totale: " + matcher.group().substring(1,matcher.group().length()-1));
            } else {
                System.out.println("Valeur totale for no."+ i +" not found");
            }


            pattern = Pattern.compile(",[A-Za-z() ]+,", Pattern.CASE_INSENSITIVE);
            matcher = pattern.matcher(data[i]);
            matchFound = matcher.find();
            if(matchFound) {
                System.out.println("\tCategorie: " + matcher.group().substring(1,matcher.group().length()-1));
            } else {
                System.out.println("Categorie for no."+ i +" not found");
            }
            System.out.println();
        }


    }
}