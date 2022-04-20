import java.util.*;
public class Absolute{
    public static void main(String[] args) {
        //scan number
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();
        //if negative times by -1
        if (num < 0){
            num = num * -1;
        }
        System.out.println("The absolute value is " + num);
    }
}