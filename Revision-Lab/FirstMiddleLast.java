import java.util.*;
public class FirstMiddleLast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();
        in.close();
        int lastPos = word.length() -1;
        System.out.println(word.substring(0, 1));
        System.out.println(word.substring(1, lastPos));
        System.out.println(word.substring(lastPos));
    }
}
