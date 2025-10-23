package bibliotekspenge_udvidelse;

public abstract class Title {

    protected String title;
    protected String literatureType;
    protected static final double RATE = 0.067574;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalty() {
        double royalty = 0;
        royalty = calculatePoints() * RATE;
        return royalty;
    }

    public abstract double calculatePoints();

    public double convertLiteratureType() {
        switch (literatureType) {
            case "BI", "TE":
                return 3.0;

            case "LYRIK":
                return 6.0;

            case "SKØN":
                return 1.7;

            case "FAG":
                return 1.0;

            default:
                return 1.0;
        }
    }


}
