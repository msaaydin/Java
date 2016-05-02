
package java_generics;


public class Java_Generics {

    
    public static void main(String[] args) {
        
        Integer array1[] = {23,344444,3411,4543,652,445,45};
        Double array2[] = {34.45,45.232,34.4533,6.434};
        Float array3[] = {454.56f,6556.45f,932.56f};
        
        FindMax<Integer> intmax = new FindMax<>();
        FindMax<Double> doublemax = new FindMax<>();
        FindMax<Float> floatmax = new FindMax<>();
        
        System.out.println("int array max..:"+intmax.maxElement(array1));
        System.out.println("double array max..:"+doublemax.maxElement(array2));
        System.out.println("float array max..:"+floatmax.maxElement(array3));
        
    }
    
}
