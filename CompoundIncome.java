package com.example;
import java.util.Scanner;
public class CompoundIncome {
 public static void main(String args[]){
   System.out.print("Enter montly saving amount : ");
   Scanner input = new Scanner(System.in);
   double amount = input.nextDouble();
   System.out.print("Enter a Annual Interest rate : ");
   double interestRate = input.nextDouble();
   final double MI = 1+(interestRate/1200.0);
   System.out.print("Enter a month to Compound Amount : ");
   int month = input.nextInt();
   double sum = 0;
   for(int i = 1 ; i <= month; i++){
     sum = (sum + amount) * MI;
   }
   System.out.println("Compound Amount : " + sum );
 }
}
