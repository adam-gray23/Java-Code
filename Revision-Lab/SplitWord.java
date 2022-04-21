import java.util.*;
public class SplitWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();
        in.close();
        for(int i = 0; i < word.length() - 1; i++){
            System.out.println(word.substring(i, i + 2));
        }
    }
}
