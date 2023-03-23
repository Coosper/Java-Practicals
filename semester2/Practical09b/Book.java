public class Book
{
    private String ISBN;
    private String authorName;
    private String bookTitle;
    private double bookCost;
    private boolean bookStatus;
    
    //A constructor which initializes the 4 values.
    public Book(String isbnIn, String authorNameIn, String bookTitleIn, double bookCostIn)
    {
        ISBN = isbnIn;
        authorName = authorNameIn;
        bookTitle = bookTitleIn;
        bookCost = bookCostIn;
        bookStatus = false;
    }
    
    //~~~GETTER METHODS!!!~~~
    
    //A get method to return the ISBN.
    public String getISBN()
    {
        return ISBN;
    }
    
    //A get method to return the authors name.
    public String getAuthorName()
    {
        return authorName;
    }
    
    //A get method to return the title of the book.
    public String getBookTitle()
    {
        return bookTitle;
    }
    
    //A get method to return the cost of the book.
    public double getBookCost()
    {
        return bookCost;
    }
    
    //A get method to see if the book is on loan or not.
    public boolean getBookStatus()
    {
        return bookStatus;
    }
    
    //~~~SETTER METHODS!!!~~~
    
    //A set method to set the ISBN.
    public void setISBN(String isbnIn)
    {
        ISBN = isbnIn;
    }
    
    //A set method to set the name of the author.
    public void setAuthorName(String authorNameIn)
    {
        authorName = authorNameIn;
    }
    
    //A set method to update the title of the book.
    public void setBookTitle(String bookTitleIn)
    {
        bookTitle = bookTitleIn;
    }
    
    //A set method to update the books cost.
    public void setBookCost(double bookCostIn)
    {
        bookCost = bookCostIn;
    }
    
    //A set method to update.
    public void setBookStatus(boolean bookStatusIn)
    {
        bookStatus = bookStatusIn;
    }
}
