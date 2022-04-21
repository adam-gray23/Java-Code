import java.util.Scanner;
public class Name {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        in.close();
        Pet pet = new Pet(name);
        System.out.println(pet.greeting());
    }
}

class Pet {
    String name;
    public Pet(String n){
        name = n;
    }
    public String greeting(){
        return ("My name is " + name);
    }
}
