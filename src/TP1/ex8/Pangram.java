package TP1.ex8;

public class Pangram {
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private String phrase;

    public Pangram(String phrase){
        this.phrase = phrase;
    }

    public boolean isPangram(){
        String[] alphabetLetters = this.alphabet.split("");
        for(String letter : alphabetLetters)
        if(this.phrase.indexOf(letter) < 0)
            return false;
        return true;
    }
}
