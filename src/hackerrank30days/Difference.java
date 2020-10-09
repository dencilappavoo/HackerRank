package hackerrank30days;

import java.util.Arrays;


public class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements)
    {
        this.elements = elements;
    }

    public void computeDifference() // 3 1 2 5
    {
        maximumDifference = 0;
        int difference = 0;
        int compare = -1, counter=0;
        for(int i=0;i<elements.length;i++)
        {
            int k = elements[i];
            for(int j=0;j<elements.length;j++)
            {
                difference = Math.abs(k - elements[j]);
                if(difference > maximumDifference)
                {
                    maximumDifference = difference;
                }
            }
        }
    }
}
