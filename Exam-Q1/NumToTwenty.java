import java.util.*;
public class NumToTwenty {
    public static void main(String[] args) {
        //scan a number
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();
        //set i to that number
        int i = num;
        //print up to 20 from that number
        while (i < 21){
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println("");
    }
}
