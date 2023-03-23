public class Question1
{
    public static void main(String[] args)
    {
        //Grab the value of the first string.
        System.out.print("Enter in a string: ");
        String object1 = EasyScanner.nextString();

        //Grab the value of the second string.
        System.out.print("Enter in a second string: ");
        String object2 = EasyScanner.nextString();

        //A gap.
        System.out.println();

        //Prints out the lengths of each string.
        System.out.println("The length of the first string is: " + object1.length());
        System.out.println("The length of the second string is: " + object2.length());

        //A gap.
        System.out.println();

        //Puts boths strings in uppercase.
        System.out.println(object1 + " to uppercase is: " + object1.toUpperCase());
        System.out.println(object2 + " to uppercase is: " + object2.toUpperCase());

        //A gap.
        System.out.println();

        //Puts boths strings in uppercase.
        System.out.println(object1 + " to lowercase is: " + object1.toLowerCase());
        System.out.println(object2 + " to lowercase is: " + object2.toLowerCase());

        //A gap.
        System.out.println();

        //Checks which comes first in the alphabet.
        if (object1.compareTo(object2) < 0)
        {
            System.out.println(object1 + " comes before " + object2 + " in the alphabet.");
        } else {
            System.out.println(object2 + " comes before " + object1 + " in the alphabet.");
        }

        //A gap.
        System.out.println();

        //Check the values at specific positions.
        System.out.println("The character at position 4 in " + object1 + " is " + object1.charAt(3));
        System.out.println("The character at position 2 in " + object2 + " is " + object2.charAt(1));

        //A gap.
        System.out.println();

        //See's if one is equal to the other
        if (object1.equals(object2))
        {
            System.out.println(object1 + " is the same as " + object2);
        } else {
            System.out.println(object1 + " is NOT the same as " + object2);
        }
        
        //A gap.
        System.out.println();
        
        //Puts them together
        System.out.println("The strings put together are " + object1.concat(object2));
        
        //A gap.
        System.out.println();
        
        //See's if one is equal to the other
        if (object1.equalsIgnoreCase(object2))
        {
            System.out.println(object1 + " is the same as " + object2);
        } else {
            System.out.println(object1 + " is NOT the same as " + object2);
        }
        
        //A gap.
        System.out.println();
        
        //Trims the strings.
        System.out.println("With no leading or trailing spaces the first string is " + object1.trim());
        System.out.println("With no leading or trailing spaces the first string is " + object2.trim());
    }
}
