package TP2.ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] data = new String[45];
        int index =0;
        try{
            File myObj = new File("passwd.txt");
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

        for(int i=0; i< data.length; i++){
            String[] fields = data[i].split(":");
            System.out.println("\tUser: " + fields[0]);
            System.out.println("\tEncrypted password: " + fields[1]);
            System.out.println("\tUser ID number (UID): " + fields[2]);
            System.out.println("\tUser's group ID number (GID): " + fields[3]);
            System.out.println("\tFull name: " + fields[4]);
            System.out.println("\tHome directory: " + fields[5]);
            System.out.println("\tLogin shell: " + fields[6]);
            System.out.println();
        }


    }
}