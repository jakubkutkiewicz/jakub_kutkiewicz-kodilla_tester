public class Book {

    private String author;
    private String title;


  public Book (String author, String title)
  {
      this.author = author;
      this.title = title;
  }

    public static Book of(String title, String author) {
Book book = new Book(author,title);{
    return book;
        }}
    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book);
    }}
