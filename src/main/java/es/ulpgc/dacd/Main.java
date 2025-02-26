package es.ulpgc.dacd;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String phrase = "Hola mundo, hola universo.";
        int uniqueWords = WordCounter.countUniqueWords(phrase);
        System.out.println("Número de palabras únicas: " + uniqueWords);
    }
}