package hackerrank30days;

//Day 4
public class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;
    private int age;
    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    Person(int initialAge)
    {
        if(initialAge <=0)
        {
            age = 0;
            System.out.println("Age is not valid");
        }
        age =  initialAge;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
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
