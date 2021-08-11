public class Complex{
      int real,complex;
      public void Print(int a,int b){
          real = a;
          complex = b;
          System.out.println(a  + " + i " + b);
      }
      public static void main (String args[]){
          Complex c1 = new Complex();
    c1.Print(2,3);
      }
     }
    
/*public class Sample{

    public static void main(String args[]){

      int[] arr1 = {1,2,3,4,5};
      int[] arr = new int[5];
      System.arraycopy(arr1,2,arr,0,3);
      for(int i = 0; i < 5 ; i++)
       System.out.println(arr[i]);
    
   // Complex c1 = new Complex();
  //  c1.Print(2,3);
   } 
   
}*/
