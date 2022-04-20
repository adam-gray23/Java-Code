import java.util.Scanner;

public class TestOneLetter
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();
        input.close();
        for(int i = 0; i < word.length(); i++)
            System.out.println(Word.showLetter(word, word.charAt(i)));
    }
}

class Word {
    public static String showLetter(String word, char guess){
        String out = "";
        for(int i = 0; i < word.length(); i++){
            if (word.charAt(i) == guess){
                out = out + guess;
            }
            else{
                out = out + "_";
            }
        }
        return out;
    }
}