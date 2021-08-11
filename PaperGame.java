package com.example;
import java.util.Scanner;
public class PaperGame {
 public static void main(String args[]){
   System.out.println("WELCOME ROCK,PAPER SCISSOR GAME \n!!!! ENJOY !!!!");
   System.out.println("ROCK'S NUMBER    : 2");
   System.out.println("PAPER'S NUMBER   : 1");
   System.out.println("SCISSOR'S NUMBER : 0");
   while(1==1){
   int computerNumber = (int)(Math.random()*3);
   System.out.print("Enter a number : ");
   Scanner input = new Scanner(System.in);
   int yourNumber = input.nextInt();
     if(computerNumber == 0)
     System.out.print("Computer is Scissor");
     else if(computerNumber == 1)
     System.out.print("Compter is Paper");
     else
     System.out.print("Computer is Rock");
     if(yourNumber == 0)
     System.out.println(" Your are Scissor ");
     else if(yourNumber == 1)
     System.out.println(" Your are Paper ");
     else
     System.out.println(" Your are Rock ");
     if(computerNumber == yourNumber){
      System.out.println("Draw the game ");
     
     }
     else if(computerNumber < yourNumber){
      System.out.println("You WON !!!\nGAME OVER");
      break;
     }
     else
       System.out.println("You Lost \nTry One Time keep it up !");
   }
 }
}
