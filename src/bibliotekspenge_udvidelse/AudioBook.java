package bibliotekspenge_udvidelse;

public class AudioBook extends PhysicalTitle {

    private final int durationInMinutes;


    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;

    }

    @Override
    public double calculatePoints() {
        double points = (durationInMinutes * 0.5) * convertLiteratureType() * copies;
        return points;
    }
}
