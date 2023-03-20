package TP2.ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] data = new String[12];
        int index =0;
        ArrayList<Entreprise> entreprises = new ArrayList<>();
        try{
            File myObj = new File("BusinessFinancialData.csv");
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
            entreprises.add(new Entreprise(fields[0], fields[1], fields[2]));
        }
        for(int i=0; i< entreprises.size(); i++){
            System.out.println(entreprises.get(i).toString());
        }
    }
}