import java.util.Scanner;

public class TestAllDone
{
    // generate the alphabet
    static String getAlphabet()
    {
        String alphabet = "";
        for(int i = 0; i < 26; i++)
            alphabet += (char) ('a' + i);
            
        return alphabet;
    }
    
    static void test(String word, String guesses)
    {
        System.out.println("allDone(\"" + word + "\", \"" + guesses + "\") is " + Word.allDone(word, guesses));
    }
    
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        String alphabet = getAlphabet();
        System.out.println("Enter a word:");
        String word = input.next();
        input.close();
        // 1. Try the complete alphabet
        test(word, alphabet);
        // 2. Try an empty string
        test(word, "");
        
        // 3. Try leaving out one letter each time (almost right)
        for(int miss = 0; miss < word.length(); miss++)
        {
            String guesses = "";
            for(int i = alphabet.length() - 1; i >= 0; i--)
                if(alphabet.charAt(i) != word.charAt(miss))
                    guesses += alphabet.charAt(i);
                    
            test(word, guesses);
        }
    }
}

class Word{
    public static boolean allDone(String word, String guesses){
        String check = "";
        for (int i = 0; i < word.length(); i++){
            for (int j = 0; j < guesses.length(); j++){
                if (guesses.charAt(j) == word.charAt(i)){
                    check = check + word.charAt(i);
                }
            }
        }
        boolean out = check.equals(word);
        return out;
    }
}