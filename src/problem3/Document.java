package problem3;

public class Document {
    private static int counter = 1;  // auto-increment field
    private int numRec;
    private String title;

    public Document(String title) {
        this.numRec = counter++;
        this.title = title;
    }

    public int getNumRec() {
        return numRec;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Document #" + numRec + " - Title: " + title;
    }
}
