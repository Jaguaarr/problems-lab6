package problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents;

    public Library(int capacity) {
        this.capacity = capacity;
        this.documents = new ArrayList<>();
    }

    public boolean add(Document doc) {
        if (documents.size() >= capacity) {
            System.out.println("Library is full! Cannot add: " + doc.getTitle());
            return false;
        }
        documents.add(doc);
        return true;
    }

    public boolean delete(Document doc) {
        return documents.remove(doc);
    }

    public Document document(int numRec) {
        for (Document doc : documents) {
            if (doc.getNumRec() == numRec) {
                return doc;
            }
        }
        return null;
    }

    public void displayDocuments() {
        System.out.println("=== Library Documents ===");
        for (Document doc : documents) {
            System.out.println(doc);
        }
    }

    public void displayAuthors() {
        System.out.println("=== Authors List ===");
        for (Document doc : documents) {
            if (doc instanceof Book) {
                System.out.println(((Book) doc).getAuthor());
            }
        }
    }
}
