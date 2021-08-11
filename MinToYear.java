package com.example;
import java.util.Scanner;
public class MinToYear {
 public static void main(String args[]){
   //promote user to Entering Minute 
   System.out.print("Enter a minute : ");
   Scanner input = new Scanner(System.in);
   long minute = input.nextLong();
   //Convert minute to day divided by (60*24)
   int day = (int)minute / (60*24);
   int year = day / 365;
   int remainingDay = day % 365;
   System.out.println(minute + " Approximately " + year + " year " + remainingDay + " day ");
 }
}
