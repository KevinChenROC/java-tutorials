interface Vegetarian{
    
}
class Animal{
    //By default, parent methods are virtual (in C++ terms).
    void walk(){
        System.out.println("Walk like a dog");
    };
}
class Dog extends Animal{
    public void walk(){
        System.out.println("Walk like a dog");
    }
}

public class Deer extends Animal implements Vegetarian{
    public void walk(){
        System.out.println("walk like a deer");
    }
    
    public static void main(String[] args) {
        Deer d = new Deer();
        Animal a = d;
        a.walk(); 
        //now a refers to a dog b
        a = new Dog();
        a.walk();
    }

}
