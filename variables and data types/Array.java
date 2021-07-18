import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.Arrays;

public class Array {
    static void modifyArray(double myArr[]){
        myArr[0] = -11234;
    }

    public static void main(String[] args) {
        double[] myArr = {1.9, 2.9, 3.4, 3.5};

        // Print all the array elements using for-loop
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i] + " ");
        }
        
        System.out.println("\nModify an array with a method, using PASS by REF");
        modifyArray(myArr); 
        // Print using foreach
        for (double num : myArr) {
            System.out.println(num + " ");
        }
        
        
        System.out.println("\nUsing Arrays.equals method");
        double anotherArr [] ={1,2,3,4};
        System.out.println(Arrays.equals(myArr, anotherArr));
    }

}
