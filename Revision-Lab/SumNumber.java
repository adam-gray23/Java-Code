import java.util.*;
public class SumNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();
        int total = 0;
        for(int i = num; i > 0; i--){
            total = total + i;
        }
        System.out.println("the sum of the numbers from 1 to " + num + " is " + total);
    }

}
