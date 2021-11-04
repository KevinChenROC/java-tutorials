import mypack.A;
import mypack.pack1.B;


// If you do not use a package statement, your type ends up in an unnamed package. Generally speaking, an unnamed package is only for small or temporary applications or when you are just beginning the development process. Otherwise, classes and interfaces belong in named packages. 
// ref: https://docs.oracle.com/javase/tutorial/java/package/createpkgs.html_


//When executing this complied file, simply call java main

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.hello();
        B b = new B();
        b.hello();
    }
}
