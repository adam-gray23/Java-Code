// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    public abstract void food();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

  // Subclass (inherit from Animal)
class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void food(){
        System.out.println("The pig eats: Carrots");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bark");
    }
    public void food(){
        System.out.println("The dog eats: Meat");
    }
}

class Test {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.food();
        myPig.sleep();
        Dog mydog = new Dog();
        mydog.animalSound();
        mydog.food();
        mydog.sleep();
    }
}