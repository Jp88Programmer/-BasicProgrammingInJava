import java.util.Scanner;
public class TrianglePattern{

    public static void main(String args[]){
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a row number : ");
     int row = input.nextInt();
     int k = 1;
     for(int i = 1 ; i <= row ; i++){
         k = 1;
       for(int j = 1 ; j <= 2*row-1 ; j++){
           if(j>=(row+1-i)&&j<=(row+i-1)){
               System.out.print(k);
               k=j>=row ? --k : ++k ;
           }
           else
            System.out.println();
       }
       System.out.printf("\n");
     }

    }
}
