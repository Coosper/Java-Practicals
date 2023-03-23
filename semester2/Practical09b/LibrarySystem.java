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
            System.out.println("6. Display details of a book.");
            System.out.println("7. Delete a book.");
            System.out.println("8. Loan a book.");
            System.out.println("9. Return a book.");
            System.out.println("0. Quit.");
            System.out.println();
            System.out.print("Enter choice [0-9]: ");
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
                case 6:
                    displayBookDetails(myLibrary);
                    break;
                case 7:
                    removeBook(myLibrary);
                    break;
                case 8:
                    loanBook(myLibrary);
                    break;
                case 9:
                    returnBook(myLibrary);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option!");
                    break; 
            }
        } while (option != 0);
    } 

    //A method to add books.
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

    //A method to remove books.
    private static void removeBook(Library myLibrary)
    {
        System.out.print("Enter the ISBN of the book you wish to delete: ");
        boolean ok = myLibrary.remove(EasyScanner.nextString()); 

        if (ok == true)
        {
            System.out.println("Book was removed succesfully from the library system.");
        } else {
            System.out.println("No book exists with the provided ISBN");
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

    //A method to search books by ISBN.
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

    //A method to loan out a book.
    private static void loanBook(Library myLibrary)
    {
        System.out.print("Enter the ISBN number of the book you are looking for: ");
        Book book = myLibrary.getItem(EasyScanner.nextString());

        if (book != null) 
        {
            if (book.getBookStatus()) {
                System.out.println("The book is already on loan");
            } else {
                book.setBookStatus(true);
                System.out.println("The book is available for loan and is not set to 'on loan'.");
            }
        } else {
            System.out.println("No book with this ISBN exists in the library.");
        }

        System.out.println();
    }

    private static void returnBook(Library myLibrary)
    {
        System.out.print("Enter the ISBN number of the book you are looking for: ");
        Book book = myLibrary.getItem(EasyScanner.nextString());

        if (book != null){
            if (book.getBookStatus() == true) {
                book.setBookStatus(false);
                System.out.println("The book is now returned succesfully.");
            } else {
                System.out.println("No such book has been on loan.");
            }
        } else {
            System.out.println("No book with this ISBN exists in the library.");
        }
        
        System.out.println();
    }

    //A method to display total amount of books in the library.
    private static void displayTotal(Library myLibrary)
    {
        System.out.println("There is currently " + myLibrary.getTotal() + " books in the library");
        System.out.println();
    }

    //A method to display the details of a book.
    private static void displayBookDetails(Library myLibrary)
    {
        System.out.print("Enter the ISBN number of the book your are looking for: ");
        Book newBook = myLibrary.getItem(EasyScanner.nextString());
        System.out.println();

        if(newBook == null) 
        {
            System.out.println("This book does not exist.");
        } else {
            System.out.println("Book details.");
            System.out.println("Author: " + newBook.getAuthorName());
            System.out.println("Title: " + newBook.getBookTitle());
            System.out.println("ISBN: " + newBook.getISBN());
            System.out.println("Cost: " + newBook.getBookCost());
        }

        System.out.println();
    }

}
