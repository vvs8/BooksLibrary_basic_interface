import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Library lib = new Library();

    
    lib.addBook("A Confession", "Maxim Gorky");
    lib.addBook("Fooled by Randomness", "Nassim Taleb");
    lib.addBook("The Nose", "Nikolai Gogol");
    
    lib.print();

    System.out.println("\n*** Get/Check/Return Book Test ***");
    System.out.println(lib.getBook(1));
    System.out.println(lib.checkBook(1));
    System.out.println(lib.returnBook(1) + "\n");
    
    System.out.println("\n*** Swap Book Test ***");
    lib.swapBook("A Confession [new]", "Maxim Gorky", 0);
    System.out.println(lib.checkBook(1));
    System.out.println(lib.checkBook(0));
    
    //Remove Book
    lib.removeBook(0);

    lib.print();
    lib.getBook(2);
    lib.addToFreeShelf("A Confession", "Maxim Gorky", 0);
    lib.print();
    
    lib.addToFreeShelf("A Confession", "Maxim Gorky", 0); //Error - No Space
  }
}
