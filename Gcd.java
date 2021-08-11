import java.util.Scanner;
public class Gcd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
     System.out.print("Enter a first number : ");
     int number1 = input.nextInt();
     System.out.print("Enter a second number : ");
     int number2 = input.nextInt();
     System.out.println("Gratest Common division of (" + number1 + "," + number2 + ")  is : " + Gcd(number1,number2));
   
    }
    public static int Gcd(int a,int b){
        if(a%b == 0)
         return b;
        if(a == 0)
         return b;
        return Gcd(b,a%b);
	}
}