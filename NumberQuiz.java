package com.example;
import java.util.Scanner;
public class NumberQuiz {
 public static void main(String args[]){
   //define two numbers and generate random number and assign integer type through type casting
    int number1 = (int)(Math.random()*10);
    int number2 = (int)(Math.random()*10);
   //Subtraction is negative than resolve in below
    if(number1 < number2){
      int temp;
      temp=number1;
      number1=number2;
      number2=temp;
    }
    //Display the statement and ask the questions 
    System.out.print("What is "+ number1 + " - " + number2 + "? :");
    Scanner input = new Scanner(System.in);
    int answer = input.nextInt();
    //if Answer == number1 - number2 display correct else Incorrect and display number1-number2
    if(number1 - number2 == answer)
    System.out.println("Answer is Correct !");
    else{
      System.out.println("Answer is Incorrect !!");
      System.out.println(number1 + " - " + number2 + " = " + (number1-number2));
    }
 }
}
