
/**
 * A class for creating book objects.
 *
 * @author Kwinn Danforth
 * @version 1.01
 */
public class Book
{
    // instance variables 
    public String authorLastName;
    public String authorFirstName;
    public int isbnNumber;
    public String title;
    public String pubDate;
    public int numPages;
    /**
     * Constructor for objects of class Book
     */
    public Book(String authorLastName, String authorFirstName, int isbnNumber, String title, String pubDate, int numPages)
    {
    this.authorLastName = authorLastName;
    this.authorFirstName = authorFirstName;
    this.isbnNumber = isbnNumber;
    this.title = title;
    this.pubDate = pubDate;
    this.numPages = numPages;
    }

    /**
     * An assesor method for the author of the books last name
     *
     * 
     * @return    authorLastName
     */
    public String getAuthorLastName()
    {
       return authorLastName;
    }

    /**
     * An assesor method for the author of the books first name
     *
     * 
     * @return    authorFirstName
     */
    public String getAuthorFirstName()
    {
       return authorFirstName;
    }
    
    /**
     * An assesor method for the ISBN number of the book
     *
     * 
     * @return    isbnNumber
     */
    public int getISBNNumber()
    {
       return isbnNumber;
    }
    
    /**
     * An assesor method for the title of the book.
     *
     * 
     * @return    title
     */
    public String getTitle()
    {
       return title;
    }
    
    /**
     * An assesor method for the publication Date of the book
     *
     * 
     * @return    pubDate
     */
    public String getPubDate()
    {
       return pubDate;
    }
    
    /**
     * An assesor method for the number of pages in the book.
     *
     * 
     * @return    numPages
     */
    public int getNumPages()
    {
       return numPages;
    }
    

}
