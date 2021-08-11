package com.example;
import java.util.Scanner;
public class ComputeGratuity {
 public static void main(String args[]){
   //promotes from user to enter subtotal and gratuityRate
   System.out.print("Enter subtotel and gratuity rate : ");
   Scanner input = new Scanner(System.in);
   double subtotel = input.nextDouble();
   double gratuityRate = input.nextDouble();
   double gratuity = (int)(subtotel * gratuityRate * 100 / 100) /100.0;
   double totel = (int)((subtotel + gratuity)*100) / 100.0 ;
   System.out.println("gratuity = " + gratuity + "\ntotel = " + totel);
 }
}
