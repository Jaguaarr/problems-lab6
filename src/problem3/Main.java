package problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter library capacity: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Library lib = new Library(n);

        // Initialize with two documents
        lib.add(new Novel("The Hobbit", "J.R.R. Tolkien", 310, 15.99));
        lib.add(new Textbook("Data Structures", "Mark Allen Weiss", 500, "University"));

        int choice;
        do {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Add Document");
            System.out.println("2. Delete Document");
            System.out.println("3. Display Documents");
            System.out.println("4. Display Authors");
            System.out.println("5. Search by numRec");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter document type (1-Book, 2-Magazine, 3-Dictionary): ");
                    int type = sc.nextInt(); sc.nextLine();
                    System.out.print("Title: "); String title = sc.nextLine();

                    if (type == 1) {
                        System.out.print("Author: "); String author = sc.nextLine();
                        System.out.print("Pages: "); int pages = sc.nextInt();
                        sc.nextLine();
                        lib.add(new Book(title, author, pages));
                    } else if (type == 2) {
                        System.out.print("Month: "); String month = sc.nextLine();
                        System.out.print("Year: "); int year = sc.nextInt();
                        lib.add(new Magazine(title, month, year));
                    } else if (type == 3) {
                        System.out.print("Language: "); String lang = sc.nextLine();
                        lib.add(new Dictionary(title, lang));
                    }
                    break;

                case 2:
                    System.out.print("Enter numRec to delete: ");
                    int num = sc.nextInt();
                    Document d = lib.document(num);
                    if (d != null && lib.delete(d))
                        System.out.println("Deleted successfully!");
                    else
                        System.out.println("Document not found.");
                    break;

                case 3:
                    lib.displayDocuments();
                    break;

                case 4:
                    lib.displayAuthors();
                    break;

                case 5:
                    System.out.print("Enter numRec: ");
                    int id = sc.nextInt();
                    Document doc = lib.document(id);
                    System.out.println(doc != null ? doc : "Document not found.");
                    break;
            }

        } while (choice != 0);

        System.out.println("Exiting...");
    }
}
