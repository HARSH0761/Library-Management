import java.util.*;

public class LibrarySystem {

    static class Book {
        String id, title, author, genre, status;

        public Book(String id, String title, String author, String genre, String status) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.status = status;
        }

        public String toString() {
            return String.format("| %-5s | %-20s | %-15s | %-10s | %-12s |", id, title, author, genre, status);
        }
    }

    static List<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // 📚 Add Book
    static void addBook() {
        System.out.print("📌 ID: ");
        String id = sc.nextLine();
        System.out.print("📌 Title: ");
        String title = sc.nextLine();
        System.out.print("📌 Author: ");
        String author = sc.nextLine();
        System.out.print("📌 Genre: ");
        String genre = sc.nextLine();
        System.out.print("📌 Status (Available/Checked Out): ");
        String status = sc.nextLine();

        if (!status.equalsIgnoreCase("Available") && !status.equalsIgnoreCase("Checked Out")) {
            System.out.println("❌ Invalid status! Use 'Available' or 'Checked Out'");
            return;
        }

        books.add(new Book(id, title, author, genre, status));
        System.out.println("✅ Book added successfully!");
    }

    // 🔎 View All Books
    static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("📚 No books found.");
            return;
        }
        System.out.println("\n| ID    | Title                | Author         | Genre      | Status       |");
        System.out.println("----------------------------------------------------------------------------");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // 🔍 Search Book by ID or Title
    static void searchBook() {
        System.out.print("🔎 Enter ID or Title: ");
        String query = sc.nextLine();
        boolean found = false;

        for (Book book : books) {
            if (book.id.equalsIgnoreCase(query) || book.title.equalsIgnoreCase(query)) {
                System.out.println("✅ Found: " + book);
                found = true;
            }
        }
        if (!found) System.out.println("❌ Book not found.");
    }

    // 🔧 Update Book
    static void updateBook() {
        System.out.print("✏️ Enter Book ID to update: ");
        String id = sc.nextLine();

        for (Book book : books) {
            if (book.id.equalsIgnoreCase(id)) {
                System.out.print("📌 New Title: ");
                book.title = sc.nextLine();
                System.out.print("📌 New Author: ");
                book.author = sc.nextLine();
                System.out.print("📌 New Status: ");
                book.status = sc.nextLine();
                System.out.println("✅ Book updated!");
                return;
            }
        }
        System.out.println("❌ Book not found.");
    }

    // ❌ Delete Book
    static void deleteBook() {
        System.out.print("🗑️ Enter Book ID to delete: ");
        String id = sc.nextLine();
        books.removeIf(book -> book.id.equalsIgnoreCase(id));
        System.out.println("✅ Book deleted!");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n📚 LIBRARY MANAGEMENT SYSTEM 📚");
            System.out.println("1️⃣ Add Book");
            System.out.println("2️⃣ View All Books");
            System.out.println("3️⃣ Search Book");
            System.out.println("4️⃣ Update Book");
            System.out.println("5️⃣ Delete Book");
            System.out.println("6️⃣ Exit");
            System.out.print("👉 Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();  

            switch (choice) {
                case 1: addBook(); break;
                case 2: viewBooks(); break;
                case 3: searchBook(); break;
                case 4: updateBook(); break;
                case 5: deleteBook(); break;
                case 6: 
                    System.out.println("👋 Exiting... Thank you!");
                    System.exit(0);
                default: 
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }
    }
}
