package TP2.ex6;

import TP2.ex3.Entreprise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
//            String[] fields = data[i].split(",");
            Pattern patternCode = Pattern.compile("BDCQ.SF1[A-Z]+[0-9]+CA", Pattern.CASE_INSENSITIVE);
            Matcher matcherCode = patternCode.matcher(data[i]);
            boolean matchFoundCode = matcherCode.find();
            if(!matchFoundCode) {
                System.out.println("Code for no."+ i +" not found");
            }

            Pattern patternVT = Pattern.compile(",[0-9]+.[0-9]*,", Pattern.CASE_INSENSITIVE);
            Matcher matcherVT = patternVT.matcher(data[i]);
            boolean matchFoundVT = matcherVT.find();
            if(!matchFoundVT) {
                System.out.println("Valeur totale for no."+ i +" not found");
            }

            Pattern patternCategorie = Pattern.compile(",[A-Za-z() ]+,", Pattern.CASE_INSENSITIVE);
            Matcher matcherCategorie = patternCategorie.matcher(data[i]);
            boolean matchFoundCategorie = matcherCategorie.find();
            if(!matchFoundCategorie) {
                System.out.println("Categorie for no."+ i +" not found");
            }
            entreprises.add(new Entreprise(matcherCode.group(), matcherVT.group().substring(1,matcherVT.group().length()-1), matcherCategorie.group().substring(1,matcherCategorie.group().length()-1)));
        }
        for(int i=0; i< entreprises.size(); i++){
            System.out.println(entreprises.get(i).toString());
        }
    }
}