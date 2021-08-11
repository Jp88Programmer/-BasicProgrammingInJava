import java.util.Scanner;
public class MoneyCovert{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the Amount (Rupee) : ");
		//Read the Amount in Rupee 
		double rupee = input.nextDouble();
		//Convert in paisa
        double paisa =((int)rupee*100)/10000.0;
        double dollar =((int) rupee*100)/7479.0; 
        double bitcoin = ((int) rupee*100)/258715732.0;
        double euro = ((int)rupee*100)/8828.0;
        System.out.println("₹"+rupee +"   = "+ paisa + " paisa"+"\n₹"+ rupee +"   = " + dollar +" dollar" + "\n₹" + rupee + "   = " + bitcoin  + " bitcoin" + "\n₹" +rupee+ "   = " +euro+" euro");
        
	}
}