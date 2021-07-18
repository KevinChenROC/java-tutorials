//default modifer make Puppy visible to all classes inside this package
class Puppy {
   //constructor overloading
   public Puppy() {
       System.out.println("calling a constructor without a name ");
   }

   public Puppy(String name) {
        System.out.println("calling a constructor with " + name);
      // This constructor has one parameter, name.
   }
}

public class Constructor {
    public static void main(String[] args) {
        Puppy p1 = new Puppy();
        Puppy p2 = new Puppy("Kevin");

    }
}
