import java.util.Scanner;
//Scanner class 
public class SalesTax{
	public static void main(String args[ ]){
		Scanner input = new Scanner(System.in);//Scanner object  Read the input from console
		System.out.print("Enter a purchase Amount : ");
		double purchaseAmount = input.nextDouble();
		//promotes the user for the input 
		double tax =(int)(purchaseAmount * 0.06*100)/100.0;
		System.out.println("purchase Amount is : " + purchaseAmount + "\ntax is : "+ tax);
		//Display Answer 
		}
	}