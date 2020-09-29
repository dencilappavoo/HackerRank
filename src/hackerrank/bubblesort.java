package hackerrank;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] unSortedArr = new int[]{1,7,11,30,31,25,15};
        boolean isSorted = false;
        int lastUnsorted = unSortedArr.length-1;
        while (!isSorted)
        {
            isSorted=true;
            for(int i=0;i<lastUnsorted;i++)
            {
                if(unSortedArr[i] > unSortedArr[i+1])
                {
                    Swap(unSortedArr,i,i+1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
        for (int i: unSortedArr) { System.out.println(i); }
}

public static void Swap(int[] array,int i, int j)
{
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
}

}
