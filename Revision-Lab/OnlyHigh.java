import java.util.*;
public class OnlyHigh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();
        in.close();
        for(int i = 0; i < word.length() - 1; i++){
            if (word.subSequence(i, i + 2).equals("hi")){
                System.out.println("hi");
            }
        }
    }
}
