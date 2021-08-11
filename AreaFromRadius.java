package com.example;
import java.util.Scanner;
public class AreaFromRadius {
 public static void main(String args[]){
  final double PI = 3.14;
  System.out.println("Enter the radius  : ");
   //Scanner object built
  Scanner input = new Scanner(System.in);
  //Enter the radius from user
  double radius = input.nextDouble();
  //Area of Circle
  double areaOfCircule = (int)(PI * radius * radius*100)/100.0;
  //Area of Spare 
  double areaOfSpare = 4 * areaOfCircule;
  //Area of Half Spare 
  double areaOfHalfSpare = 2 * areaOfCircule;
  //Volume Of Spare
  double volumeOfSpare = (4.0/3)*(PI*radius*radius*radius);
  //Volume Of Half Spare 
  double volumeOfHalfSpare = (0.5)*(int)(volumeOfSpare*100)/100.0;
  //Display the above data 
  System.out.println("Area of Circle       : " + areaOfCircule);
  System.out.println("Area of Spare        : "+ areaOfSpare + "\nVolume of Spare      : " + volumeOfSpare);
  System.out.println("Area of HalfSpare    : "+ areaOfHalfSpare + "\nVolume of HalfSpare  : " + volumeOfHalfSpare);
 }
}
