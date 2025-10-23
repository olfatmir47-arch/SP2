package bibliotekspenge_udvidelse;

public class PrintedBook extends PhysicalTitle {

    private final int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {

        super(title, literatureType, copies);
        this.copies = copies;
        this.pages = pages;


    }

    public double calculatePoints() {
        double points = pages * convertLiteratureType() * copies;
        return points;

    }
}
