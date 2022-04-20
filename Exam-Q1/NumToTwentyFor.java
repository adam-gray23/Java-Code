import java.util.*;
public class NumToTwentyFor {
    public static void main(String[] args) {
        //scan a number
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();
        //print up to 20 frm that number
        for (int i = num; i < 20; i++){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
