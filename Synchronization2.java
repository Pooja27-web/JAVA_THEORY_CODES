import java.util.Scanner;

class Details {
    // Display header
    void head() {
        System.out.println("BOOK DETAILS");
        System.out.println("------------------");
    }

    // Synchronized method to ensure thread-safe book detail printing
    synchronized void library(String detail) {
        System.out.print("[" + detail);

        try {
            Thread.sleep(1000); // Simulate delay
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("]");
    }
}

// Thread class to print book details
class MyThread1 extends Thread {
    private final Details printBk;
    private final String det;

    MyThread1(Details printBk, String det) {
        this.printBk = printBk;
        this.det = det;
    }

    public void run() {
        printBk.library(det);
    }
}

public class Synchronization2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Loop to collect multiple book details
        while (true) {
            System.out.println("Do you want to add a book? (yes/no)");
            String input = s.nextLine().trim().toLowerCase();

            if (input.equals("no") || input.equals("n")) {
                System.out.println("Thank You for Using Exiting...");
                break;
            } else if (input.equals("yes") || input.equals("y")) {
                System.out.println("Enter Book Name:");
                String bookName = s.nextLine();
                System.out.println("Enter Book Author:");
                String bookAuthor = s.nextLine();
                System.out.println("Enter Book Publish Date:");
                String bookPublishDate = s.nextLine();
                System.out.println("Enter Book Price:");
                String bookPrice = s.nextLine();

                // Create and display book details
                Details d = new Details();
                d.head();

                MyThread1 b1 = new MyThread1(d, "Book Name: " + bookName);
                MyThread1 b2 = new MyThread1(d, "Book Author: " + bookAuthor);
                MyThread1 b3 = new MyThread1(d, "Book Publish Date: " + bookPublishDate);
                MyThread1 b4 = new MyThread1(d, "Book Price: " + bookPrice);

                b1.start();
                b2.start();
                b3.start();
                b4.start();

                try {
                    b1.join();
                    b2.join();
                    b3.join();
                    b4.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
        s.close();
    }
}
