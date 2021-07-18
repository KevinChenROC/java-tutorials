package overriding;

class base{
    //visible to all its child clases and other classes in this package
    
    protected void f1(int a, int b){
        System.out.println("call base.f1");
        System.out.println(a+b);
    }
}

class child extends base{
    // overriding f1 by different arguments...
    protected void f1(int a, int b){
        System.out.println("call child.f1");
        System.out.println(a-b);
    }
    
    protected void f1(char a, int b){
        System.out.println("call child.f1");
        System.out.println(a-b);
    }
    
    protected void f1(int a, int b, int c){
        System.out.println("call child.f1");
        System.out.println(a-b+c);
    }

    //this produce an error because the return type != that of base.f1!
    // protected int f1(int a, int b){
    //     System.out.println(a-b);
    //     return 1;
    // }


}

public class basic_usage {
    public static void main(String[] args) {
        base b = new base();
        b.f1(1,2);

        child c = new child();
        c.f1(1,2); //c
        c.f1('1',2);
        c.f1(1,2,100);
    }
}
