public class Book{
    static String libraryName = "Gutenberg Library";
    private String title;
    private String author;
    private final int Isbn;

    public Book(String title, String author , int isbn){
        this.title = title;
        this.author = author;
        this.Isbn = isbn;
    }
    //display the name of the library
    public static void displayLibraryName(){ 
        System.out.println("The name of Library is: " + libraryName);
    }


    public void displayDetails(){
        if(this instanceof Book){  // check if the object belong to the class
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + Isbn);
        }
    }

    public static void main(String[] args) {
        Book book = new Book("Oliver Twist" , "Charles Dickens" , 33153966);
        book.displayDetails(); // display the book details
        Book.displayLibraryName(); // display the library name
    }
}