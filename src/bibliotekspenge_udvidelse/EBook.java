package bibliotekspenge_udvidelse;

public class EBook extends NetTitle{

    private int characters;
    private boolean illustraded;

    public EBook(String title, String literatureType, int availability, int reach, int use, int characters, boolean illustrated){
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.illustraded = illustrated;

    }

    private double calculatePages(){
double calculatedPages;

calculatedPages =  (double) characters /1800 + 20;

        if(illustraded){
            calculatedPages *= 0.1;
        }
        return calculatedPages;

    }

    @Override
    public double calculatePoints(){
        return calculatePages() * convertLiteratureType() * getPseudoCopies();


    }
}
