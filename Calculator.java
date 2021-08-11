public class Calculator {
 public static void main(String args[]){
   if(args.length > 3){
    System.out.println("Please,Check the Syntax");
    System.exit(0);
   }
   int number1 = Integer.parseInt(args[0]);
   int number2 = Integer.parseInt(args[2]);
   switch(args[1].charAt(0)){
     case '+' :
      System.out.println(args[0]  + " + " + args[2] +" = " + (number1 + number2)); break;
     case '-' :
      System.out.println(args[0]  + " - " + args[2] + " = " + (number1 - number2)); break;
     case '*' :
      System.out.println(args[0]  + " + " + args[2] + " = " + (number1 * number2)); break ;
     case '/' :
      System.out.println(args[0]  + " + " + args[2] + " = " +  (number1 / number2)); break ;
     default :
      System.out.println("Syntax error");
   }
 }
}