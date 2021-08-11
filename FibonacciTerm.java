public class FibonacciTerm{
 public static void main(String args[]){
   long a = 0;
   long b = 1 ;
   for(int i = 0 ; i < 60; i++){
     long c = a + b ;
     a = b;
     b = c ;
     if((i  + 1) % 6 == 0)
     System.out.printf( "%-20d\n ",c);
     else
     System.out.printf("%-20d",c);
   }
 }
}
