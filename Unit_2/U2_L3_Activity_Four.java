package Edhesive.Unit_2;

/* Lesson 3 Coding Activity Question 4 */

import java.util.Scanner;

public class U2_L3_Activity_Four {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String word = scan.nextLine();
        String[] words = word.split(" ", 2);
        System.out.println(words[0].length());
    }
}