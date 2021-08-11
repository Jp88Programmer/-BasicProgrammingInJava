package example;
import java.util.Scanner;
public class DayOfWeek {
 public static void main(String args[]){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a year : ");
   int year = input.nextInt();
   System.out.print("Enter a month (1-12) : ");
   int month = input.nextInt();
   System.out.print("Enter the day of month (1-31) : ");
   int day = input.nextInt();
   if(day == 1)
   day = 13;
   if(day == 2)
   day = 14;
   int century = year / 100;
   int yearOfTheCentury = year % 100;
   int dayOfWeek = (day + 26*(month+1)/10 + yearOfTheCentury + yearOfTheCentury/4 + century/4 + (5*century) ) % 7;
   switch(dayOfWeek){
     case 0 :
      System.out.println("Saturday");
      break;
     case 1 :
      System.out.println("Sunday");
      break;
     case 2 :
      System.out.println("Monday");
      break;
     case 3 :
      System.out.println("Tuesday");
      break;
     case 4 :
      System.out.println("Wednesday");
      break;
     case 5 :
      System.out.println("Thursday");
      break;
     case 6 :
      System.out.println("Friday");
      break;
   }
 }
}
