package example;

public class CharCast {
 public static void main(String args[]){
  // char b= (char)615.78;
  // System.out.println(a);
  /* for(int a = 0; a<=1000 ; a++){
 // b = (char)a;
  // System.out.println(b);
    }*/
   //int a = 'π' ;
  // System.out.println(a);
  //Casting into byte 
  char a = '\u0033';
  char b  = 'Z';
  //System.out.println(b);
  //casting with floating point
  //double d = a;
  //System.out.println(d);
  //System.out.println(a+b);
  //--------Character class method--------//
  System.out.println("isDigit('a') is " + Character.isDigit('a'));
System.out.println("isLetter('a') is " + Character.isLetter('a'));
System.out.println("isLowerCase('a') is "
 + Character.isLowerCase('a'));
System.out.println("isUpperCase('a') is "
 + Character.isUpperCase('a'));
System.out.println("toLowerCase('T') is "
 + Character.toLowerCase('T'));
System.out.println("toUpperCase('q') is "
 + Character.toUpperCase('q'));
 }
}
