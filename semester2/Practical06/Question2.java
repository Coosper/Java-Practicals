
public class Question2
{
    public static void main(String[] args)
    {
        //Reading in the word.
        System.out.print("Enter in a string: ");
        String word = EasyScanner.nextString();
        
        //Reading in the starting letter.
        System.out.print("Enter in starting letter: ");
        String letter1 = EasyScanner.nextString();
        
        //Reading in the ender letter.
        System.out.print("Enter in ending letter: ");
        String letter2 = EasyScanner.nextString();
        
        //A gap.
        System.out.println();
        
        if (word.startsWith(letter1))
        {
           System.out.println(word + " starts with " + letter1); 
        } else {
            System.out.println(word + " does not start with " + letter1);
        }
        
        if (word.endsWith(letter2.toLowerCase()))
        {
            System.out.println(word + " ends with " + letter2);
        } else {
            System.out.println(word + " does not end with " + letter2);
        }
    }
}
