public class Catch {
    public static void main(String[] args) {
        try{
            Broken broke = new Broken();
            System.out.println("Testing");
            broke.cracked();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught the exception.");
        }
    }
}

class Broken
{
   // method generates an exception
    public void cracked()
    {
        int [] zap = new int[10];
        System.out.println("Excepting!");
        System.out.println(zap[10]);
    }
}