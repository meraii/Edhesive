package Edhesive.Unit_1;

/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;
import java.lang.Math;

class U1_L6_Activity_Two {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Please input a decimal number:");
    double n = scan.nextDouble();
    System.out.println("Answer: " + Math.round(n));

  }
}
