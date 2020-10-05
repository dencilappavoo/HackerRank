package hackerrank30days;

import java.util.Arrays;


class Student extends Person{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here

    Student(String firstName, String lastName, int id, int[] scores)
    {
        super(firstName,lastName,id);
        this.testScores = scores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public char calculate()
    {
        char resultGrade='T';
        int averageScore = 0;
        for(int i=0;i<this.testScores.length;i++)
        {
            averageScore += testScores[i];
        }
        averageScore = averageScore/testScores.length;

        if(averageScore >= 90 && averageScore <=100)
        {
            resultGrade = 'O';
        }
        else if(averageScore >= 80 && averageScore <90)
        {
            resultGrade = 'E';
        }
        else if(averageScore >=70 && averageScore < 80)
        {
            resultGrade = 'A';
        }
        else if(averageScore >= 55 && averageScore <70)
        {
            resultGrade = 'P';
        }
        else if(averageScore >= 40 && averageScore <55)
        {
            resultGrade = 'D';
        }
        else
        {
            resultGrade = 'T';
        }

        return resultGrade;
    }
}