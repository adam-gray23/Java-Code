public abstract class Animal {
    public abstract String greeting();
    public static void main(String[] args){
        Pig mypig = new Pig();
        System.out.println(mypig.greeting());
    }
}

class Pig extends Animal
{
    // since Animal has an abstract method greeting(), Pig needs to implement greeting.
    public String greeting()
    {
        return "Oink";
    }
}