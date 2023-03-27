package TP2.ex8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        int index =0;
        try{
            File myObj = new File("files\\TP2\\typescript_class.ts");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data.add(myReader.nextLine()+"\r\n");
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        for(int i=0; i< data.size() - 1; i++){
            if(data.get(i).contains("import")) {
                String library = data.get(i).split("'")[1];
                System.out.println("Bibliotheque utilisee: " + library);
            }
            if(data.get(i).contains("class")){
                ArrayList<String> words = new ArrayList<>(List.of(data.get(i).split(" ")));
                String className = words.get(words.indexOf("class") + 1);

                if(data.get(i).contains("extends")) {
                    String classNameExt = words.get(words.indexOf("extends") + 1);
                    System.out.println("Classe enfant declaree: " + className + " avec le parent: " + classNameExt);
                } else {
                    System.out.println("Classe declaree: " + className);
                }
            }
            if(data.get(i).contains("function")) {
                ArrayList<String> words = new ArrayList<>(List.of(data.get(i).split("[ :()\r\n]")));
                String functionName = words.get(words.indexOf("function") + 1);
                String returnType = words.get(words.indexOf("{") - 1);
                System.out.println("Fonction declaree: " + functionName + " avec le type de retour: " + returnType);
            }
        }
    }
}