package example;

public class TrigonometryTable {
 public static void main(String args[]){
   System.out.print("     ");
   for(int i = 0 ; i <= 120 ; i += 15)
   System.out.printf("%8d",i);
   System.out.print("\n");
   System.out.print("\nSin : ");
   getSineValue();
   System.out.print("\nCos : ");
   getCosValue();
   System.out.print("\nTan : ");
   getTanValue(); 
 }
 public static void getSineValue(){
   for(int i = 0 ; i <= 120 ; i += 15)
  System.out.printf("%8.3f",Math.sin(Math.toRadians(i)));
  System.out.print("\n");
 }
 public static void getCosValue(){
   for(int i = 0 ; i <= 120 ; i += 15)
  System.out.printf("%8.3f",Math.cos(Math.toRadians(i)));
  System.out.print("\n");
 }
 public static void getTanValue(){
   for(int i = 0 ; i <= 120 ; i += 15){
    if(i == 90)
    System.out.printf("%8.1f",((int)Math.tan(Math.toRadians(i))*100)/100.0);
    else System.out.printf("%8.3f",Math.tan(Math.toRadians(i)));
  }
  System.out.print("\n");
 }
}
