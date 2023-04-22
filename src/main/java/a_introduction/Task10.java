package a_introduction;
public class Task10 {
    public static void main(String[] args) {
        bookDetails("Hobbit", "Wyatt", "David Wyatt");
    }

    public static void bookDetails(String title, String author, String publisher) {
        System.out.println(title + " autorstwa " + author + " wydany przez Wydawnictwo " + publisher);  //Hobbit, autorstwa JR. Tolkien wydany przez Wydawnictwo X`

    }

}



//package a_introduction;

//public class Task10 {

  //  public static void main(String[] args) {
  //      // System.out.println(bookDetails("Hobbit", "Tolkien", "David Wyatt"));
        // bookDetails("Hobbit", "Tolkien", "David Wyatt");

 //   }

 //   public static String bookDetails(String title, String author, String publisher) {
  //      System.out.println(bookDetails("Hobbit", "Tolkien", publisher));


  //  }

//}
//Napisz metodę, która przyjmie trzy parametry
//- String title
//- String author
//- String publisher
//i zwraca napis w postaci `Hobbit, autorstwa JR. Tolkien wydany przez Wydawnictwo X`
//-