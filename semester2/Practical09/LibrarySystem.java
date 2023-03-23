public class LibrarySystem
{
    public static void main(String [] args) 
    {
        int option;
        
        System.out.print("Please enter the maximum amount of books in the library: ");
        int bookAmount = EasyScanner.nextInt();
        System.out.println();
        
        Library myLibrary = new Library(bookAmount);
        
        //A do while loop which displays the menu and uses a switch statement to make it functional.
        do{
            System.out.println("The Bookworm Library");
            System.out.println();
            System.out.println("1. Enter a new book.");
            System.out.println("2. Check if Library is full.");
            System.out.println("3. Check if Library is empty.");
            System.out.println("4. Display number of books in the library.");
            System.out.println("5. Search for a book.");
            System.out.println("0. Quit.");
            System.out.println();
            System.out.print("Enter choice [0-5]: ");
            option = EasyScanner.nextInt();
            System.out.println();
            
            //The switch statement that gives the options to operate the Library System.
            switch (option) {
                case 1:
                    addBook(myLibrary);
                    break;
                case 2:
                    isItFull(myLibrary);
                    break;
                case 3: 
                    isItEmpty(myLibrary);
                    break;
                case 4: 
                    displayTotal(myLibrary);
                    break;
                case 5:
                    searchBook(myLibrary);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option!");
                    break; 
            }
        } while (option != 0);
    } 
    
    private static void addBook(Library myLibrary)
    {
        System.out.println("Enter new book details.");
        System.out.print("ISBN number: ");
        String tempISBN = EasyScanner.nextString();
        System.out.print("Author: ");
        String tempAuthor = EasyScanner.nextString();
        System.out.print("Title: ");
        String tempTitle = EasyScanner.nextString();
        System.out.print("Cost: ");
        double tempCost = EasyScanner.nextDouble();
        
        Book book1 = new Book(tempISBN,tempAuthor,tempTitle,tempCost);
        
        boolean status = myLibrary.add(book1);
        
        if(status == true) 
        {
            System.out.println("Your book has been added to the library.");
        } else {
            System.out.println("The array is full - your book has not been added.");
        }
        System.out.println();
    }
    
    private static void isItEmpty(Library myLibrary)
    {
        boolean empty = myLibrary.isEmpty();
        
        if(empty == true)
        {
            System.out.println("The library is currently empty.");
        } else {
            System.out.println("The library is not currently empty.");
        }
        
        System.out.println();
    }
    
    private static void isItFull(Library myLibrary)
    {
        boolean full = myLibrary.isFull();
        
        if(full == true)
        {
            System.out.println("The library is currently full.");
        } else {
            System.out.println("The library is not currently full.");
        }
        
        System.out.println();
    }
    
    private static void searchBook(Library myLibrary)
    {
        System.out.print("Enter the ISBN number of the book you are looking for: ");
        String tempISBN = EasyScanner.nextString();
        
        if (myLibrary.search(tempISBN) == -999)
        {
            System.out.println("The book you are looking for is NOT in the library system.");
        } else {
            System.out.println("The book you are looking for is in the library system.");
        }
        
        System.out.println();
    }
    
    private static void displayTotal(Library myLibrary)
    {
        System.out.println("There is currently " + myLibrary.getTotal() + " books in the library");
        System.out.println();
    }
}
