import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        //scan a number
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();
        //do if even
        if (num % 2 == 0){
            System.out.println(num + " is even");
        }
        //do if odd
        else{
            System.out.println(num + " is odd");
        }
    }
}
