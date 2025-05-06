import java.util.Scanner;
class Publisher {
    String publisherName;

    Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}

class Book extends Publisher {
    String title;
    String author;
    Book(String publisherName, String title, String author) {
        super(publisherName);
        this.title = title;
        this.author = author;
    }
}
class Literature extends Book {
    Literature(String publisherName, String title, String author) {
        super(publisherName, title, author);
    }
    void display() {
        System.out.println("Category: Literature");
        System.out.println("Title    : " + title);
        System.out.println("Author   : " + author);
        System.out.println("Publisher: " + publisherName);
        System.out.println("---------------------------");
    }
}
class Fiction extends Book {
    Fiction(String publisherName, String title, String author) {
        super(publisherName, title, author);
    }
    void display() {
        System.out.println("Category: Fiction");
        System.out.println("Title    : " + title);
        System.out.println("Author   : " + author);
        System.out.println("Publisher: " + publisherName);
        System.out.println("---------------------------");
    }
}

public class BookStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Literature books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Literature[] literatureBooks = new Literature[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Literature book " + (i + 1));
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Publisher: ");
            String publisher = sc.nextLine();
            literatureBooks[i] = new Literature(publisher, title, author);
        }

        System.out.print("\nEnter number of Fiction books: ");
        int n1 = sc.nextInt();
        sc.nextLine();

        Fiction[] fictionBooks = new Fiction[n1];
        for (int i = 0; i < n1; i++) {
            System.out.println("\nEnter details for Fiction book " + (i + 1));
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Publisher: ");
            String publisher = sc.nextLine();
            fictionBooks[i] = new Fiction(publisher, title, author);
        }

        System.out.println("\n------ Literature Books-----");
        for (Literature book : literatureBooks) {
            book.display();
        }

        System.out.println("\n----Fiction Books----");
        for (Fiction book : fictionBooks) {
            book.display();
        }

        sc.close();
    }
}

