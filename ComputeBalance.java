import java.util.Scanner;
public class ComputeBalance{
	public static void main(String[] args) {
	//make Scanner object input
	Scanner input = new Scanner(System.in);
	System.out.print("Enter loan amount  : ");
	//Read the loan amount 
	double loanAmount = input.nextDouble();
	System.out.print("Enter the Annual Interest Rate  : ");
	//Entering Annual Interest Rate
  	double interestRate = input.nextDouble();
	System.out.print("Enter the number of years : ");
	//promote the user to enter number of year
	int numberOfYear = input.nextInt();
  //calculate montlyInterestRate //
	double montlyInterestRate = interestRate / 1200;
	//calculate montly payment
	double montlyPayment = loanAmount*montlyInterestRate/(1-1/Math.pow(1+montlyInterestRate,numberOfYear*12));
	//calculate total payment
	double totalPayment = montlyPayment * numberOfYear * 12 ;
	//attaining two digits after the point 
	montlyPayment =(int)(montlyPayment*100)/100.0;
	totalPayment =(int)(totalPayment*100)/100.0;
	//Display the statement of montlyPayment and totalPayment 
	System.out.println("Montly payment is : " + montlyPayment + "\nTotal Payment is : " + totalPayment);
	double balance = loanAmount ;
	for (int i = 1; i <= numberOfYear * 12 ;  i++) {
double  interest = montlyInterestRate * balance;
double  principal = montlyPayment - interest;
 balance = balance - principal;
 System.out.println(i + "\t " +((int)(interest*100)/100.0)
 + "\t   " +((int) (principal *100)/100.0)+ "\t  " + ((int)(balance*100)/100.0) + "\n");
}
	}
}