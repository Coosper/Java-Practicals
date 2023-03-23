public class Question3
{
    public static void main(String[] args)
    {
        //Records the first word.
        System.out.print("Enter a word: ");
        String word1 = EasyScanner.nextString();
        
        //Enters in the letter to be replaced.
        System.out.print("What letter is to be replaced: ");
        char letter1 = EasyScanner.nextChar();
        
        //Enters in the letter to be replaced by.
        System.out.print("What is the replacement letter: ");
        char letter2 = EasyScanner.nextChar();
        
        //A gap.
        System.out.println();
        
        String word2 = word1.replace(letter1, letter2);
        System.out.println("The new word is: " + word2);
    }
}
