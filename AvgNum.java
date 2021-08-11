import java.util.Scanner; //import package define java.util (package) 
//Scanner is predefined class it's read input from console
public class AvgNum{
	//make class 
	public static void main(String[] args) {
		//main method
		Scanner sc=new Scanner(System.in);
	   //make object sc int Scanner class 
	   //System.in is standard input method
         System.out.print("Enter a three numbers :: ");
	      int num1 = sc.nextInt();
	    //nextInt predefined method to seem input int type 
	    int num2 = sc.nextInt();
	    int num3 = sc.nextInt();
  //		for(int i=1;i<=N;i++)
	//	System.out.print(i+" ");
	    double avg=(num1+num2+num3)/3.0;
	   System.out.println("Averages of  numbers "+ num1 + "  " + num2 +  " " + num3 + " is : " + avg);
//	 System.out.println(num1 + num2 + num3 + avg);
	}
}