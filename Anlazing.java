
import java.util.Scanner;
public class Anlazing{

    public static void main(String args[]){
    System.out.print("Enter a ten numbers : ");
    Scanner input = new Scanner(System.in);
    double [] number = new double[10];
    double sum = 0.0;
    for(int i = 0 ; i < number.length ; i++ ){
    number[i] = input.nextDouble();
    sum += number[i];
    }
    double average = sum/number.length;
    int count = 0;
    for(int i = 0 ; i < number.length ; i++ ){
     if(average < number[i])
      count++;
    }
    System.out.println("Sum of Numbers : " + sum + "\nAverage of Numbers : " + average + "\nNumber of elements above the average : " + count);
    }
}
