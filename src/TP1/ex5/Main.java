package TP1.ex5;

import java.util.ArrayList;

public class Main {
    public static ArrayList<String> substrings(String text){
        ArrayList<String> substrings = new ArrayList<>();
        for(int i = 0; i < text.length(); i++) {
            for(int j = i; j < text.length(); j++) {
                substrings.add(text.substring(i, j + 1));
            }
        }
        return substrings;
    }
    public static void main(String[] args) {
        System.out.println(substrings("cod"));
        System.out.println(substrings("Ana are mere"));
    }
}