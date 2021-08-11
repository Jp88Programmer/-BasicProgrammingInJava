import java.util.Scanner;
public class PrintPrimeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the range of the number which to print prime numbers : ");
   int number1 = input.nextInt();
   int number2 = input.nextInt();
   System.out.println("Prime number " + number1 + "to " + number2  + " are : ");
   printPrimeNumber(number1,number2);
 }
 public static void printPrimeNumber(int number1,int number2){
 final int NUMBER_IN_LINE = 10;
 int count = 0;
   for(int i = number1 ; i <= number2 ; i++){
     int j=2;
     int num = i;
     int flag = 0;
     while(j<num){
       if(num % j == 0){
        flag = 1;
        break ;
        }
        j++;
     }
     if(flag != 1 && num != 1){
      count++;
       System.out.printf("%-6d",i);
       if(count % NUMBER_IN_LINE == 0)
        System.out.print("\n");
     }
   }
 }
//	}
}