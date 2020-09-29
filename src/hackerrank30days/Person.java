package hackerrank30days;

//Day 4
public class Person {
    private int age;
    Person(int initialAge)
    {
        if(initialAge <=0)
        {
            age = 0;
            System.out.println("Age is not valid");
        }
        age =  initialAge;
    }

    public  void yearPasses()
    {
        age = age +1;
    }

    public void amIOld()
    {
        if(age < 13)
            {
                System.out.println("You are young.");
            }
        else if(age >= 13 || age < 18)
            {
                System.out.println("You are a teenager.");
            }
        else
            {
                System.out.println("You are old.");
            }
    }
}
