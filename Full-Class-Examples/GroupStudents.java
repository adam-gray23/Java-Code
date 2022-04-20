public class GroupStudents
{
    public static void main(String [] args)
    {
        Student [] group = {
            new Student("John", 50),
            new Student("Abby", 40),
            new Student("Dylan", 20),
        };

        double passingAverage = Test.getPassingAverage(group);
        System.out.println("The average mark of all students who passed is " + passingAverage);
    }
}

class Student
{
    private String name;
    private int mark;

    public Student(String n, int m)
    {
        name = n;
        mark = m;
    }
    public String getName(){
        return name;
    }
    public int getMark(){
        return mark;
    }
}

class Test {
    public static void print(Student [] student)
    {
        for(int i = 0; i < student.length; i++)
            if (student[i].getMark() >= 40 && student[i].getMark() < 50){
                System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
            }
    }

    public static int numberPasses(Student[] group){
        int passed = 0;
        for(int i = 0; i < group.length; i++){
            if (group[i].getMark() > 39){
                passed = passed + 1;
            }
        }
        return passed;
    }

    public static Student getBestStudent(Student[] group){
        int total = 0;
        Student best = null;
        for(int i = 0; i < group.length; i++){
            if (group[i].getMark() > total){
                total = group[i].getMark();
                best = group[i];
            }
        }
        return best;
    }

    public static double getPassingAverage(Student[] group){
        int total = 0;
        int passed = 0;
        for(int i = 0; i < group.length; i++){
            if (group[i].getMark() > 39){
                total = total + group[i].getMark();
                passed = passed + 1;
            }
        }
        total = total / passed;
        return total;
    }
}