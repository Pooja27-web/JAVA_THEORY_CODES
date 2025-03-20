class Book{
    synchronized void details(String book){
        System.out.println("  Book_Details");
        System.out.println("-------------------");
        System.out.print("["+book);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("]");
    }
}
class BookThread extends Thread{
    Book book1;
    String book;

    BookThread(Book book1,String book){//child consuctors
        this.book1=book1;
        this.book=book;
    }

    public void run(){
        book1.details(book);
    }
}

public class Synchronization_Book_Details {
    public static void main(String[]args){
        Book b=new Book();
        BookThread m1=new BookThread(b,"Book_Name: Java");
        BookThread m2=new BookThread(b,"Book_Price: 70$");
        BookThread m3=new BookThread(b,"Book_Publish_Date: 18-03-2025");
        BookThread m4=new BookThread(b,"Book_Author: Bhuvan B Krishna");
        m1.start();
        m2.start();
        m3.start();
        m4.start();
    }
}
