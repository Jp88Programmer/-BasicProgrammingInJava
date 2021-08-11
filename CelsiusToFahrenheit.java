package com.example;

import java.util.Scanner;

public class CelsiusToFahrenheit {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Make Scanner object to Read data
    System.out.print("Enter a temperature in Celsius : ");
    double celsius = input.nextDouble();
    double fahrenheit = (9.0 / 5) * celsius * 100 / 100.0 + 32.0;
    System.out.println("\nTemperature in Fahrenheit is " + fahrenheit);
  }
}
