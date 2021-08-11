import java.util.Scanner;
public class NumberConversation{
	public static void main(String args[]){
		 Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
          int n = input.nextInt();
          System.out.println("Binary Number  : " + decToBinary(n) + "\nOctal Number  : " + decToOct(n));
		}

    public static String decToBinary(int n){

  //   Scanner input = new Scanner(System.in);
  //System.out.println("Enter a number : ");
  //   int n = input.nextInt();
     String sum = "";
     while(n > 0){
         sum = "" + n%2 + sum ;
         n/=2;
     }
    // System.out.println(sum);
    return sum;
    }
    public static String decToOct(int n){

  //   Scanner input = new Scanner(System.in);
  //System.out.println("Enter a number : ");
  //   int n = input.nextInt();
     String sum = "";
     while(n > 0){
         sum = "" + n%8 + sum ;
         n/=8;
     }
    // System.out.println(sum);
    return sum;
    }
}
