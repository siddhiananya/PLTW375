
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library library = new Library();
    ArrayList<Book> childrensBooks = library.getChildrensBooks();

    String authorToFind = "L. Frank Baum";
    String bookToFind = "Sky Island";
    double minimumRating = 0.0; 

    System.out.println("Books by L. Frank Baum: ");
    for (Book book: childrensBooks)
    {
      if (book.getAuthor().equals(authorToFind))
      {
        System.out.println(book.getTitle());
      }
    }

    System.out.println("Books with the same rating: ");
    for (Book book: childrensBooks)
    {
      if (book.getAuthor().equals(authorToFind))
      {
        if (book.getTitle().equals(bookToFind))
        {
          minimumRating = book.getRating();
          //System.out.println(minimumRating);
        }
      }
    }

    for (Book book: childrensBooks)
    {
      if (book.getRating() >= minimumRating)
      {
        System.out.printf("Title: %-35s Author: %-30s Rating: %.2f\n", book.getTitle(), book.getAuthor(), book.getRating());      
      }
    }
  
  }
}
