import java.util.*;
public class HiCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();
        in.close();
        int total = 0;
        for(int i = 0; i < word.length() - 1; i++){
            if (word.subSequence(i, i + 2).equals("hi")){
                total = total + 1;
            }
        }
        System.out.println(total);
    }
}
