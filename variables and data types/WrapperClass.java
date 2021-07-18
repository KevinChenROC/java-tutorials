public class WrapperClass {

   public static void main(String args[]) {
      Integer x = 5; // boxes int to an Integer object
      x =  x + 10;   // unboxes the Integer to a int

      /*
      ==========calling wrapper class methods===================
      */
      System.out.println(x.toString());
      System.out.println(x.floatValue());
      System.out.println(x.doubleValue());
      System.out.println(x.equals(1));

      
     
   }
}