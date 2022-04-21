import java.util.Scanner;
public class AnimalList {
    public static Animal [] makeSomeNoise()
    {
        Animal [] animals = {new Cat("Angel"), new Cat("Cheesire"), new Dog("Buster"), new Dog("Fido"), new Cat("Lassie")};
        return animals;
    }

    public static void main(String [] args)
    {
        Animal [] animals = makeSomeNoise();
        for(Animal animal : animals)
            System.out.println(animal.greeting());
    }
}

abstract class Animal {
    public Animal(String n)
    {
        this.name = n;
    }

    abstract String hello(Animal this);
    
    public String greeting()
    {
        return (this.hello() + ", I am " + name);
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