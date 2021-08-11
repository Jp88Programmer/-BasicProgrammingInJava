package com.example;
import java.util.Scanner;
public class Lottery {
 public static void main(String args[]){
    System.out.println("|| WELCOME TO LOTTERY GAME ||\nGET WIN WIN WIN !!! ");
    System.out.println("FOUR DIGIT MATCH WIN ₹100000 ");
   System.out.println("THREE DIGIT MATCH WIN ₹10000 ");
   System.out.println("TWO DIGIT MATCH WIN ₹2000 ");
   System.out.println("ONE DIGIT MATCH WIN ₹100 ");
   System.out.println("ANYONE DIGIT NOT SAME NO REWARD ");
   //To generate Random number in range to [0.10000)
   int randomNumber = (int)Math.random()*10000 + 1 ;
   //To promote user entering four digits number
   System.out.print("Enter a lottery numbers \n( e.g. 5 => 0005 ) : ");
   Scanner input = new Scanner(System.in);
   int lotteryNumber = input.nextInt();
   int count = 0;
   while(lotteryNumber>0){
     if(lotteryNumber % 10 == randomNumber % 10)
     count++;
     lotteryNumber/=10;
     randomNumber/=10; 
   }
   if(count>4)
   System.out.println("Please Read the Instruction and than chose your ticket");
   else {
   switch(count){
     case 1 : 
      System.out.println("YOU WIN ₹100");
      break ;
     case 2 : 
      System.out.println("YOU WIN ₹2000");
      break;
     case 3 :
      System.out.println("YOU WIN ₹10000");
      break;
     case 4 :
      System.out.println("YOU WIN ₹100000");
      break ;
     default :
      System.out.println("SORRY , YOU AREN'T WIN REWARD \nBETTER LUCK NEXT TIME");
   }
  }
 }
}
