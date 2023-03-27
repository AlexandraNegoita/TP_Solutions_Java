package TP2.ex7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] data = new String[45];
        int index =0;
        try{
            File myObj = new File("files\\TP2\\passwd.txt");
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

        for(int i=0; i< data.length; i++) {
            List<String> allMatches = new ArrayList<String>();
            Matcher m = Pattern.compile("([A-Za-z\\-,\\/\\\\()]+):([A-Za-z\\/]+):?([0-9]+)?:?([0-9]+)?:?([A-Za-z \\-\\,]+)?:?([A-Za-z0-9\\/\\\\]+)?:?([A-Za-z\\/\\\\]+)?")
                    .matcher(data[i]);
            while (m.find()) {
                allMatches.add(m.group(1));
                allMatches.add(m.group(2));
                allMatches.add(m.group(3));
                allMatches.add(m.group(4));
                allMatches.add(m.group(5));
                allMatches.add(m.group(6));
                allMatches.add(m.group(7));

                System.out.println("\tUser: " + allMatches.get(0));
                System.out.println("\tEncrypted password: " + allMatches.get(1));
                System.out.println("\tUser ID number (UID): " + allMatches.get(2));
                System.out.println("\tUser's group ID number (GID): " + allMatches.get(3));
                System.out.println("\tFull name: " + allMatches.get(4));
                System.out.println("\tHome directory: " + allMatches.get(5));
                System.out.println("\tLogin shell: " + allMatches.get(6));
                System.out.println();
            }
        }


    }
}