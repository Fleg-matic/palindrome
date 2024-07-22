package com.winside.craft.utils;

import com.winside.craft.beans.Words;

import java.util.List;
import java.util.Scanner;

public class PalindromeUtils {

    private Words word = new Words();

    private void isPalindrome() {
        String normalWord = word.getWord();
        int wordSize = normalWord.length();
        String invertedWord = "";

        for (int i = 0; i < wordSize; i++) {
            int j = wordSize - i;
            char currentLetter = word.getWord().charAt(i);
            //System.out.println(currentLetter);
            invertedWord = currentLetter + invertedWord;
            //System.out.println(invertedWord);
        }

        if (invertedWord.contains(normalWord)) {
            String builder = new StringBuilder("Le mot ")
                    .append(invertedWord)
                    .append(" est le même que le mot ")
                    .append(normalWord)
                    .append(", donc c'est un palindrome")
                    .toString();
            System.out.println(builder);
        } else {
            String builder = new StringBuilder("Le mot ")
                    .append(invertedWord)
                    .append(" n'est pas le même que le mot ")
                    .append(normalWord)
                    .append(", donc ce n'est pas un palindrome")
                    .toString();
            System.out.println(builder);
        }
    }

    public void makeResult() {
        System.out.println("Veuillez entrer un mot : ");
        Scanner scan = new Scanner(System.in);
        String enter = scan.nextLine();
        System.out.println("Le mot que vous avez choisi est : " + enter);
        word.setWord(enter);

        isPalindrome();
    }
}
