import java.util.Scanner;

public class AllLetters
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user for a word and some guesses
        System.out.print("Enter a word and some guesses: ");
        String word = in.next();
        String guesses = in.next();
        in.close();
        String show = Word.showLetters(word, guesses);
        System.out.println(show);
    }
}

class Word {
    public static String showLetters(String word, String guessed){
        String out = "";
        for(int i = 0; i < word.length(); i++){
            boolean check = false;
            for(int j = 0; j < guessed.length(); j++){
                if(word.charAt(i) == guessed.charAt(j)){
                    check = true;
                }
            }
            if (check){
                out = out + word.charAt(i);
            }
            else{
                out = out + "_";
            }
        }
        return out;
    }
}