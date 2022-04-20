import java.util.*;
public class NoMinusOne {
    public static void main(String[] args) {
        //scan numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        //starting number
        int start = in.nextInt();
        //make a store
        int store = 0;
        //while current num is not -1
        while (start != -1){
            //store current num
            store = start;
            //take next num
            start = in.nextInt();
        }
        in.close();
        //print current stored number (previous number)
        System.out.println("The penultimate number was: " + store);
    }
}
