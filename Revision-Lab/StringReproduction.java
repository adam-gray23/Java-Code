import java.util.*;
public class StringReproduction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number and a string: ");
        int num = in.nextInt();
        String word = in.next();
        in.close();
        for(int i = 0; i < num; i++){
            System.out.print(word);
        }
    }
}