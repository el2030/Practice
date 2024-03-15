public class Book {
    private int bookNo;
    private String title;
    private String author;
    private float price;

    public Book(int bookNo, String title, String author, float price) {
        this.bookNo = bookNo;
        if (title.length()<4){
            System.out.println("Title of the book must have at least 4 characters");
        }
        else {
            this.title = title;
        }
        this.author = author;
        if (price < 1 || price > 5000) {
            System.out.println("Price must be in the range 1 to 5000");
        }
        else {
            this.price = price;
        }
        BookDetails.increaseBookCount();
    }

    public static void main(String[] args) {

    }

    public int getBookNo() {
        return bookNo;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public float getPrice() {
        return price;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
