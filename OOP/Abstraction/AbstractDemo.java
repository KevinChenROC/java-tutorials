abstract class Employee {
   private String name;
   private String address;
   private int number;

   public Employee(String name, String address, int number) {
       System.out.println("Constructing an Employee");
       this.name = name;
      this.address = address;
      this.number = number;
    }
    
    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }
    
    protected String getName(){
        return name;
    }
    //this must be implemented
    // public abstract void foo();
}


class Salary extends Employee {
   private double salary;   // Annual salary
   
   public Salary(String name, String address, int number, double salary) {
      super(name, address, number);
      this.salary = salary;
   }
   
   public void mailCheck() {
      System.out.println("Within mailCheck of Salary class ");
      System.out.println("Mailing check to " + getName() + " with salary " + salary);
   }

 
}

// Properties of abstract class
// 1.Abstract class cannot be instantiated
// 2.Abstract methods must be implemented.

public class AbstractDemo {
    public static void main(String [] args) {
        // Employee em = new Employee("John Adams", "Boston, MA", 2);

        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck(); 

        //this will call Salary.mailcheck() because parent methods are virtual always in Java. 
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
   }
}