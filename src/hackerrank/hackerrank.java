package hackerrank;
import java.util.Scanner;

public class hackerrank
{

    public static void main(String[] args) {

        Scanner inputN = new Scanner(System.in);
        System.out.println("Enter number");
        Integer number =  Integer.parseInt(inputN.next());
        displayResult(number);
        inputN = new Scanner(System.in);
    }

    static void displayResult(Integer number)
    {
        int startNumber =1,modThree,modFive;
        String displayResult;
        while (startNumber<=number)
        {
            displayResult="";
            modThree = startNumber%3;
            modFive = startNumber%5;

            if(0==modThree && 0==modFive){displayResult="FizzBuzz";System.out.println(displayResult);
                startNumber++;continue;}
            if(0==modThree && 0!=modFive){displayResult="Fizz";System.out.println(displayResult);
                startNumber++;continue;}
            if(0!=modThree && 0==modFive){displayResult="Buzz";System.out.println(displayResult);
                startNumber++;continue;}
            if((0!=modThree && 0==modFive)|| (0!=modThree && 0!=modFive)){displayResult = String.valueOf(startNumber);System.out.println(displayResult);
                startNumber++;continue;}
            }
        }
}


