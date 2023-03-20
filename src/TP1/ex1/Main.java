package TP1.ex1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("a)");
        System.out.println(Arrays.stream(args).toList());
        System.out.println("b)");
        System.out.println(args.length);
        System.out.println("c)");
        for(int i = 0; i < args.length; i++){
            System.out.println("Argument no. " + (i+1) + ": " + args[i]);
        }

    }
}