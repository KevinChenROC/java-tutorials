public class StaticVariables {

   // salary  variable is a private static variable
   private static double salary;

   // DEPARTMENT is a constant
   public static final String DEPARTMENT = "Development ";

   public static void main(String args[]) {
      salary = 1000;
      System.out.println(StaticVariables.DEPARTMENT + "average salary:" + StaticVariables.salary);

      foo();
      foo();
      foo();
   }

   static void foo(){
       // static int a =0 // a local variable cannot be declared static, unlike C++
       int a =0; 
       a++;
       System.out.println(a);
   }
}