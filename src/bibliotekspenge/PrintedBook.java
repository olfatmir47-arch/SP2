package bibliotekspenge;

public class PrintedBook extends Title {

    private final int pages;
    private final int copies;

    public PrintedBook(String title, String literatureType, int copies, int pages) {

        super(title, literatureType);
        this.copies = copies;
        this.pages = pages;


    }

    protected double calculatePoints() {
        double points = pages * convertLiteratureType() * copies;
        return points;

    }
}
