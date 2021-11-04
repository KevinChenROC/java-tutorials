package com.mycompany.app;
import com.mycompany.app.mypack.A;
import com.mycompany.app.mypack.pack1.B;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World, from App.java" );
        A a = new A();
        a.hello();
        B b = new B();
        b.hello();

    }
}
