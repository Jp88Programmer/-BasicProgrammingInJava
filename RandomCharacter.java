//package example;
public class RandomCharacter {
 public static void main(String args[]){
 	for(int i = 0 ; i < 50 ; i++)
 	  if((i +1 )%10 == 0)
 	 System.out.print(getRandomUpperCase() + "\n");
 	 else
 	  System.out.print(getRandomUpperCase() + "  ");
 	}
 public static char randomCharacter(char c1,char c2){
   return (char)(c1 + Math.random()*(c2-c1+1));
 }
 public static char getRandomLowerCase(){
   return randomCharacter('a','z');
 }
 public static char getRandomUpperCase(){
   return randomCharacter('A','Z');
 }
 public static char getRandomDigit(){
   return randomCharacter('0','9');
 }
 public static char randomCharacter(){
   return randomCharacter('\u0000','\uFFFF');
 }
}
