
/**
 * This class for parsing and printing book objects.
 *
 * @author Kwinn Danforth
 * @version 1.01
 */
public class BookShelf
{
    private int numBooks;
    private Book book1;
    /**
     * Constructor for objects of class BookShelf
     */
    public BookShelf()
    {
        numBooks = 0;
    }

    /**
     * A Method to add a book to the shelf
     *
     * 
     */
    public void addBook(String authorLastName, String authorFirstName, int isbnNumber, String title, String pubDate, int numPages)
    {
    if(numPages>9){
        book1 = new Book(authorLastName, authorFirstName, isbnNumber, title, pubDate, numPages);
        numBooks++;
    }else{
        System.out.println("Sorry " + numPages + " is less than 10 pages. Book will not be entered");
    }
    }
    
    /**
     * A Method to print the information about the book
     *
     * 
     */
    public void printBook()
    {
        System.out.println("Title: " + book1.title);
        System.out.println("Author: " + book1.authorFirstName + " " + book1.authorLastName);
        System.out.println("ISBN Number: " + book1.isbnNumber);
        System.out.println("Publication Date: " + book1.pubDate);
        System.out.println("Number of Pages: " + book1.numPages);
    }
    
    /**
     * A Method to print the title of the book
     *
     * 
     */
    public void printBookTitle()
    {
        System.out.println("Title: " + book1.getTitle());

    }
    
    /**
     * A Method to print the first name of the author of the book
     *
     * 
     */
    public void printBookAuthorFName()
    {
        System.out.println("Author: " + book1.getAuthorFirstName());
    }
    
    /**
     * A Method to print the last name of the author of the book
     *
     * 
     */
    public void printBookAuthorLName()
    {
        System.out.println("Author: "+ book1.getAuthorLastName());
    }
    
    /**
     * A Method to print the ISBN number of the book
     *
     * 
     */
    public void printBookISBNNumber()
    {
        System.out.println("ISBN Number: " + book1.getISBNNumber());
    }
    
    /**
     * A Method to print the publication date of the book
     *
     * 
     */
    public void printBookPublicationDate()
    {
        System.out.println("Publication Date: " + book1.getPubDate());
    }
    
    /**
     * A Method to print the number of pages in the book
     *
     * 
     */
    public void printBookNumberOfPages()
    {
        System.out.println("Number of Pages: " + book1.getNumPages());
    }
}

