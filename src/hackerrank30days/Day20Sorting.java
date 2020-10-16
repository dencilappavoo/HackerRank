package hackerrank30days;
//Bubble Sort
public class Day20Sorting {
    public static void main(String[] args) {
        int n = 7;
        int[] a = {12,13,1,7,28,55,77}; //new int[n];
        int countSwap = 0;
        for(int i = 0, size = a.length; i < size - 1; ++i)
            for (int j = 0; j < size - 1 - i; ++j) {
                if ((a[j]) > a[j + 1]) {
                    countSwap++;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
    System.out.println("Array is sorted in "+countSwap+" swaps.");
    System.out.println("First Element: "+a[0]);
    System.out.println("Last Element: "+a[n-1]);

    }
}
