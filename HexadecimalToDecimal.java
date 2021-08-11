package example;
import java.util.Scanner;
public class HexadecimalToDecimal {
 public static void main(String args[]){
  //promote the string  
  System.out.print("Enter a Hexadecimal Code : ");
  Scanner input = new Scanner(System.in);
  String hexNumber = input.next();
  long sum = 0;
  long hexSixteen = 1;
  for(int i = hexNumber.length()-1;i>=0;i--){
    char ch = hexNumber.charAt(i);
    int dec =hexCharToDec(ch);
    sum += hexSixteen*dec;
    hexSixteen *= 16 ;
  }
   System.out.println("Hexadecimal Code : " + hexNumber + " To Convert \nDecimal Code : " + sum);
 }
 public static int hexCharToDec(char ch){
   int dec ;
   switch(ch){
     case 'A' :
      dec = 10;
      break;
     case 'B' :
      dec = 11;
      break ;
     case 'C' :
      dec = 12;
      break ;
     case 'D' :
      dec = 13;
      break ;
     case 'E' :
      dec = 14;
      break ;
     case 'F' :
      dec = 15;
      break ;
     default :
      dec = ch - 48;
      break ;
   }
   return dec;
 }
}
