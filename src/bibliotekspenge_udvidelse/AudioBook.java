package bibliotekspenge_udvidelse;

public class AudioBook extends Title {

    private final int durationInMinutes;
    private final int copies;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType);
        this.durationInMinutes = durationInMinutes;
        this.copies = copies;

    }

    @Override
    public double calculatePoints() {
        double points = (durationInMinutes * 0.5) * convertLiteratureType() * copies;
        return points;
    }
}
