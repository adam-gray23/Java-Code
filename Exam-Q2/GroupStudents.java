public class GroupStudents
{
    public static void main(String [] args)
    {
        //array of students
        Students [] group = {
            new Students("John", 50),
            new Students("Abby", 40),
            new Students("Dylan", 20),
            new Students("Carl", 70),
            new Students("Maeve", 70),
            new Students("Chris", 46),
            new Students("James", 55),
            new Students("Anne", 63),
        };
        //call from Test class numberPasses to see how many passed
        int numPassed = Test.numberPasses(group);
        System.out.println(numPassed + " students passed out of " + group.length);
        System.out.println("That is an " + 100.0 * numPassed / group.length + "% pass rate.");
    }
}

class Students {
    //fields
    private String name;
    private int mark;

    //constructor
    public Students(String n, int m)
    {
        name = n;
        mark = m;
    }
    //methods
    //gets the name
    public String getName()
    {
        return name;
    }
    //gets the mark
    public int getMark()
    {
        return mark;
    }
}

//---------------------------------
//only Test class needed for poodle
//---------------------------------

class Test {
    //takes arg of an array of students from the student class
    public static int numberPasses(Students [] students){
        int passed = 0;
        for(int i = 0; i < students.length; i++){
            //for each student, if mark greater than 40
            if (students[i].getMark() >= 40){
                //add one to passed
                passed = passed + 1;
            }
        }
        return passed;
    }
}