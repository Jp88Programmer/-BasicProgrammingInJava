import java.util.Scanner;
public class ComputeLoan{
public static void main(String[] args) {
//make Scanner object input
Scanner input = new Scanner(System.in);
System.out.print("Enter the loan amount (e.g. 100000) : ");
//Read the loan amount
double loanAmount = input.nextDouble();
System.out.print("Enter the Annual Interest Rate in percentage(e.g  3.4% to  3.4) : ");
//Entering Annual Interest Rate
double interestRate = input.nextDouble();
System.out.print("Enter the number of years (e.g 5) : ");
//promote the user to enter number of year
int numberOfYear = input.nextInt();
//calculate montlyInterestRate //
double montlyInterestRate = interestRate / 1200;
//calculate montly payment
double montlyPayment = loanAmount*montlyInterestRate/(1-1/Math.pow(1+montlyInterestRate,numberOfYear*12));
//calculate total payment
double totalPayment = montlyPayment * numberOfYear * 12 ;
//attaining two digits after the point
montlyPayment = (int)(montlyPayment*100)/100.0;
totalPayment = (int)(totalPayment*100)/100.0;
//Display the statement of montlyPayment and totalPayment
System.out.println("Montly payment is : " + montlyPayment + "\nTotal Payment is : " + totalPayment);
}
}