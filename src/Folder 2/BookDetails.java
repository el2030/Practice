import java.util.Scanner;

public class BookDetails {
    private static int bookCount;
    static {bookCount = 0;}
    static Book[] bookCase = new Book[5000];

    public static void main(String[] args) {
        String title;
        String author;
        int price;
        int bookNo;

        for (int i=0; i<3; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the title of the book, must have at least 4 characters");
            title = sc.nextLine();
            int stringLength = title.length();
            if (stringLength<4){
                System.out.println("The title of the book must have at least 4 characters.");
            }

            System.out.println("Please enter the price of the book, must be in the range of 1 to 5000");
            price = sc.nextInt();
            if (price<1 || price > 5000){
                System.out.println("Price must be between 1 and 5000");
            }
            sc.nextLine();
            System.out.println("Please enter the author of the book");
            author = sc.nextLine();
            System.out.println("Please enter the book number, must be in the range of 1 to 5000");
            bookNo = sc.nextInt();
            Book book = new Book(bookNo,title,author,price);
            bookCase[bookNo] = book;
        }
        System.out.println("book count is: " + getBookCount());
    }

    public static int getBookCount(){
        return bookCount;
    }
    protected static void increaseBookCount(){
        bookCount++;
    }

    protected static void bookSearch(int bookNum){
        if (bookCase[bookNum] != null){
            System.out.println("The book number is: "+ bookCase[bookNum].getBookNo());
            System.out.println("The book author is: "+bookCase[bookNum].getAuthor());
            System.out.println("The book price is: "+bookCase[bookNum].getPrice());
            System.out.println("The book title is: "+bookCase[bookNum].getTitle());
        }
    }
}
