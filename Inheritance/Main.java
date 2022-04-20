public class Main {
    public static void main(String []args)
	{
		Parent parent = new Child();
		System.out.println("parent.makeATwo() is " + parent.makeATwo());
	}
}

class Parent
{
    public int makeATwo()
    {
        return 2;
    }
}

class Child extends Parent{
    public int makeATwo()
    {
        return 3;
    }
}