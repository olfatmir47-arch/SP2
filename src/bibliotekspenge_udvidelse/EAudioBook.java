package bibliotekspenge_udvidelse;

public class EAudioBook extends NetTitle{

    private final int durationInMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes){
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;

    }
    @Override
    public double calculatePoints(){
        return (double) durationInMinutes / 2 * convertLiteratureType() * getPseudoCopies();

    }
}
