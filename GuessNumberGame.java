package example;
import java.util.Scanner;
public class GuessNumberGame {
 public static void main(String args[]){
   System.out.println("|******GUESS NUMBER GAME******|");
   Scanner input = new Scanner(System.in);
   int count = 0;
   int startTime =(int) System.currentTimeMillis();
   int computerNumber = (int)(Math.random()*100 + 1);
   while(1 == 1){
    // int computerNumber = (int)(Math.random()*100 + 1);
     System.out.print("Enter a number : ");
     int guessNumber = input.nextInt();
     if(guessNumber == computerNumber ){
       System.out.println("Your Guess is Correct !");
       System.out.println("You win the game !!\nEnjoy !!!");
       count++;
       break ;   
     }
     else if(guessNumber < computerNumber ){
       System.out.println("Your Guess is Lower !");
       System.out.println("Try again !\nyou can do it!!");
       count++;   
     }
     else{
      System.out.println("Your Guess is higher !");
       System.out.println("Try again !\nyou can do it!!");
       count++;
     }
   }
   int endTime = (int)System.currentTimeMillis();
   int totalTime =( endTime - startTime )/1000;
   System.out.println("Your Guess is : " + count + "\nTime : " + totalTime + " Seconds");
 }
}
