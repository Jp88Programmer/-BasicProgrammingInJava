import  java.util.Scanner; 
public class ConcatString{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string1  : ");
				String str1  = scan.nextLine();
             System.out.println("Enter a string2  : ");
				String str2  = scan.nextLine();
				str2 = str1 + str2 ;
				System.out.println("concat strings : "  + str2);	
				System.out.println("Substring  in given Concat String : " +  str2.substring(2,5));
	}
}