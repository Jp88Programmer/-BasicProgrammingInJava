package example;

public class PickCardGame {
 public static void main(String args[]){
   int number1 = (int)(2+Math.random()*13);
   int number2 = (int)(Math.random()*4);
   switch(number1){
     case 2 :
      System.out.print("The card you  picked up is 2 ");
      break ;
     case 3 :
      System.out.print("The card you picked up is 3 ");
      break ;
     case 4 :
      System.out.print("The card you  picked up is 4 ");
      break ;
      case 5 :
       System.out.print("The card you picked up is 5 ");
       break ;
      case 6 :
       System.out.print("The card you picked up is 6 ");
       break ;
        case 7 :
      System.out.print("The card you  picked up is 7 ");
      break ;
       case 8 :
      System.out.print("The card you  picked up is 8 ");
      break ;
       case 9 :
      System.out.print("The card you picked up is 9 ");
      break;
       case 10 :
      System.out.print("The card you picked up is 10 ");
      break ;
       case 11 :
      System.out.print("The card you picked up is Jack ");
      break ;
       case 12 :
      System.out.print("The card you  picked up is Queen ");
      break ;
       case 13 :
      System.out.print("The card you picked up is King ");
      break ;
       case 14 :
      System.out.print("The card you picked up is Ace "); 
      break ;
   }
   switch(number2){
     case 0 :
      System.out.println("Of clubs");
      break ;
     case 1 :
      System.out.println("Of Diamond");
      break ;
      case 2 :
      System.out.println("Of Heart");
      break ;
      case 3 :
      System.out.println("Of Spades");
      break ;
   }
 }
}
