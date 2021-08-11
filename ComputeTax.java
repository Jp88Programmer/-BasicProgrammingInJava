package com.example;
import java.util.Scanner;
public class ComputeTax {
 public static void main(String args[]){
   //Tax System Software in Indian Taxiable System
   //promotes income  frome the user 
   System.out.print("Enter Annual Income : ");
   Scanner input = new Scanner(System.in);
   double income = input.nextDouble();
   double tax = 0;
   if(income<250000)
   System.out.println("No tax Applicable !!");
   else{
   if(income<=500000){
     tax = income * 0.05;
   }
   else if(income<=1000000)
     tax = (500000-250000)*0.05 + (income-500000)*0.2;
     else if(income>1000000)
     tax = (500000-250000)*0.05 + (1000000-500000)*0.2 + (income-1000000)*0.3;
     System.out.println("Tax is : " + (int)(tax*100)/100.0);
     }
 }
}
