import java.util.*;
public class Largest {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        // Read in the three numbers
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();
        System.out.println("Test.largest(" + a + ", " + b + ", " + c + ") is " + Test.largest(a, b, c));
    }
}

class Test {
    public static int largest(int a, int b, int c){
        int largest = 0;
        if (a > largest){
            largest = a;
        }
        if (b > largest){
            largest = b;
        }
        if (c > largest){
            largest = c;
        }
        return largest;
    }
}
