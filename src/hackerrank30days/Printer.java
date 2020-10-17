package hackerrank30days;

public class Printer <T>{
    void printArray(T[] a)
    {
        for(T element: a)
        System.out.println(element);
    }
}
