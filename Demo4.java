class Book{
    String bookname;
    String author;
    String publisher;
    double price;
    int year_of_published;

    Book(String bookname, String author, String publisher, double price, int year_of_published){
        this.bookname = bookname;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.year_of_published = year_of_published;
    }

    public void display(){
        System.out.println("BookName: " +bookname);
        System.out.println("Book Author: " +author);
        System.out.println("Book Publisher: " +publisher);
        System.out.println("Book Price: " +price);
        System.out.println("Year of published: " +year_of_published);
    }
}

class BookSales{
    String sales_name;
    int no_of_sales;
    String saler_id;

    BookSales(String sales_name, int no_of_sales, String saler_id){
        this.sales_name = sales_name;
        this.no_of_sales = no_of_sales;
        this.saler_id = saler_id;
    }

    public void show(){
        System.out.println("Sales Name: " +sales_name);
        System.out.println("No of Sales: " +no_of_sales);
        System.out.println("Saler ID: " +saler_id);
    }
}

public class Demo4 {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "J.K Rowling", "June", 400, 2000);
        b1.display();

        BookSales b2 = new BookSales("Sapna Book Stall", 20, "Boo1");
        b2.show();

        System.err.println("End");
    }
}
