import java.util.*;

public class Book {
  String title;
  String auth;
  boolean pres;
  int ID;

  //Constructor
  public Book (String title, String auth, boolean pres, int ID) {
    this.title = title;
    this.auth = auth;
    this.pres = pres;
    this.ID = ID;
  }

  public String toString() {
    return "`" + title + "` ~ " + auth + " | pres: " + pres + ", ID: " + ID;
  }

}
