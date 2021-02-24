import java.util.*;

public class Library {
  ArrayList <Book> bookshelf;
  int books_owns = 0;
  int books_in = 0;
  int books_out = 0;

  //Constructor
  public Library() {
    bookshelf = new ArrayList <Book>();
  }

  //Add New Book to the Library (creates new shelf)
  public void addBook(String title, String auth) {
    boolean pres = true;
    int ID = bookshelf.size();
    bookshelf.add(ID, new Book(title, auth, pres, ID));
    books_owns++;
    books_in++;
  }

  //Borrow book / pres = false
  public Book getBook(int ID) {
    for(Book b: bookshelf) {
      if (b.ID == ID) { 
        b.pres = false;
        books_in--;
        books_out++;
        return b;
      }
    }
    return null;
  }

  //Return book / pres = true
  public Book returnBook(int ID) {
    for(Book b: bookshelf) {
      if (b.ID == ID) {
        b.pres = true;
        books_in++;
        books_out--;
        return b;
      }
    }
    return null;
  }

  //Just check the book / No action
  public Book checkBook(int ID) {
    for(Book b: bookshelf) {
      if (b.ID == ID) {
        return b;
      }
    }
    return null;
  }

  //Swap book
  public Book swapBook(String new_title, String new_author, int ID) {
    for(Book b: bookshelf) {
      if (b.ID == ID) {
        b.title = new_title;
        b.auth = new_author;
        b.pres = true;
        return b;
      }
    }
    return null;
  }

  //Remove book (doesn't delete a shelf)
  public Book removeBook(int ID) {
    for(Book b: bookshelf) {
      if (b.ID == ID) {
        books_owns--;
        //to avoid mismatch if book is never returned
        if(b.pres = false) 
        books_out--;
        if(b.pres = true)
        books_in--;
        b.title = "empty";
        b.auth = null;
        b.pres = false;
        return b;
      }
    }
    return null;
  }

  //Adds book to shelf if free
  public Book addToFreeShelf(String new_title, String new_author, int ID) {
    for(Book b: bookshelf) {
      if (b.ID == ID) {
        if (b.auth == null) {
          b.title = new_title;
          b.auth = new_author;
          b.pres = true;
          books_owns++;
          books_in++;
          return b;
        }
        else {
          System.out.println("Error - No Space");
        }
      }
    }
    return null;
  }

  //Prints full library
  public void print() {
    System.out.println("\n*** LIBRARY ***");
    System.out.println("Total Books in the Library: " + books_owns);
    System.out.println("Books in Stock: " + books_in);
    System.out.println("Books Lent Out: " + books_out);
    for(Book b: bookshelf){
			System.out.println(b);
	  }
  }
}import java.util.*;

public class Library {
  ArrayList <Book> bookshelf;
  int books_owns = 0;
  int books_in = 0;
  int books_out = 0;

  //Constructor
  public Library() {
    bookshelf = new ArrayList <Book>();
  }

  //Add New Book to the Library (creates new shelf)
  public void addBook(String title, String auth) {
    boolean pres = true;
    int ID = bookshelf.size();
    bookshelf.add(ID, new Book(title, auth, pres, ID));
    books_owns++;
    books_in++;
  }

  //Borrow book / pres = false
  public Book getBook(int ID) {
    for(Book b: bookshelf) {
      if (b.ID == ID) { 
        b.pres = false;
        books_in--;
        books_out++;
        return b;
      }
    }
    return null;
  }

  //Return book / pres = true
  public Book returnBook(int ID) {
    for(Book b: bookshelf) {
      if (b.ID == ID) {
        b.pres = true;
        books_in++;
        books_out--;
        return b;
      }
    }
    return null;
  }

  //Just check the book / No action
  public Book checkBook(int ID) {
    for(Book b: bookshelf) {
      if (b.ID == ID) {
        return b;
      }
    }
    return null;
  }

  //Swap book
  public Book swapBook(String new_title, String new_author, int ID) {
    for(Book b: bookshelf) {
      if (b.ID == ID) {
        b.title = new_title;
        b.auth = new_author;
        b.pres = true;
        return b;
      }
    }
    return null;
  }

  //Remove book (doesn't delete a shelf)
  public Book removeBook(int ID) {
    for(Book b: bookshelf) {
      if (b.ID == ID) {
        books_owns--;
        //to avoid mismatch if book is never returned
        if(b.pres = false) 
        books_out--;
        if(b.pres = true)
        books_in--;
        b.title = "empty";
        b.auth = null;
        b.pres = false;
        return b;
      }
    }
    return null;
  }

  //Adds book to shelf if free
  public Book addToFreeShelf(String new_title, String new_author, int ID) {
    for(Book b: bookshelf) {
      if (b.ID == ID) {
        if (b.auth == null) {
          b.title = new_title;
          b.auth = new_author;
          b.pres = true;
          books_owns++;
          books_in++;
          return b;
        }
        else {
          System.out.println("Error - No Space");
        }
      }
    }
    return null;
  }

  //Prints full library
  public void print() {
    System.out.println("\n*** LIBRARY ***");
    System.out.println("Total Books in the Library: " + books_owns);
    System.out.println("Books in Stock: " + books_in);
    System.out.println("Books Lent Out: " + books_out);
    for(Book b: bookshelf){
			System.out.println(b);
	  }
  }
}
