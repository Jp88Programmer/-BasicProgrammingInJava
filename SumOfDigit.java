package com.example;
import java.util.Scanner;
public class SumOfDigit {
 public static void main(String args[]){
   System.out.print("Enter a number to sum the digit : ");
   Scanner input = new Scanner(System.in);
   int number = input.nextInt();
   int sum = 0;
   while(number > 0){
     sum += number % 10;
     number /= 10; 
   }
   System.out.println("Number of Digit : " + sum);
 }
}
