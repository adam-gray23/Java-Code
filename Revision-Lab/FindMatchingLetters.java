import java.util.*;
public class FindMatchingLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two lines:");
        String line1 = in.next();
        String line2 = in.next();
        in.close();
        int total = 0;
        for(int i = 0; i < line1.length(); i++){
            if (line1.substring(i, i+1).equals(line2.substring(i, i+1))){
                total = total + 1;
            }
        }
        System.out.println("There are " + total + " corresponding characters.");
    }
}
