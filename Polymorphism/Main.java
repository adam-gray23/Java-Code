public class Main
{
    public static void main(String [] args)
    {
        Animal cat = new Cat("Angel");
        Animal dog = new Dog("Fido");
        System.out.println(cat.greeting());
        System.out.println(dog.greeting());
    }
}

abstract class Animal {
    public Animal(String n)
    {
        name = n;
    }

    abstract String hello();
    
    public String greeting()
    {
        return hello() + ", I am " + name;
    }
    // private
    private String name;
}

class Cat extends Animal {
    public Cat(String n){
        super(n);
    }
    public String hello(){
        return ("Meow");
    }
}

class Dog extends Animal {
    public Dog(String n){
        super(n);
    }
    public String hello(){
        return ("Woof");
    }
}