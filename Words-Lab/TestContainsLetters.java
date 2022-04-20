import java.util.Scanner;

public class TestContainsLetters
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        // Ask the user for a word and a letter
        System.out.print("Enter a word and a letter: ");
        String word = in.next();
        char letter = in.next().charAt(0);
        in.close();
        if(Word.containsLetter(word, letter))
            System.out.println(letter + " is in " + word);
        else
            System.out.println(letter + " is not in " + word);
    }
}

class Word {
    public static boolean containsLetter(String word, char letter){
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == letter){
                return true;
            }
        }
        return false;
    }
}