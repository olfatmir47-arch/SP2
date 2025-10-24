package bibliotekspenge_udvidelse;

public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        //opretter  forfatter
        Author newAuthor = new Author("Karen Blixen");
        Author newAuthor1 = new Author("H.C. Andersen");
        Author newAuthor2 = new Author("Steven King");
        Author newAuthor3 = new Author("Sven Dahl");

        //opretter bøger
        AudioBook aBook1 = new AudioBook("Engle og Dæmoner", "TE", 132, 180);
        PrintedBook pBook1 = new PrintedBook("Engle og Dæmoner", "TE", 150, 333);
        PrintedBook pBook2 = new PrintedBook("Rip, Rap og Rup", "SKØN", 999, 55);
        EBook eBook1 = new EBook("Ondskabens hotel", "FAG", 68, 30, 20, 150000, true);
        EAudioBook eABook1 = new EAudioBook("Kaniner og heste", "BI", 130, 90, 66, 30);
        PrintedBook pBook3 = new PrintedBook("Fyrtøjet", "LYRIK", 10000, 120);

        //tilføjer bøger til forfatter
        newAuthor.addTitle(aBook1);
        newAuthor.addTitle(pBook1);
        newAuthor.addTitle(pBook2);
        newAuthor1.addTitle(pBook3);
        newAuthor2.addTitle(eBook1);
        newAuthor3.addTitle(eABook1);

        //udprinter total points
        System.out.println("forfatter: " + newAuthor.getName() + " :" + newAuthor.calculateRoyalties() + "dkk");
        System.out.println("forfatter: " + newAuthor1.getName() + " :" + newAuthor1.calculateRoyalties() + "dkk");
        System.out.println("forfatter: " + newAuthor2.getName() + " :" + newAuthor2.calculateRoyalties() + "dkk");
        System.out.println("forfatter: " + newAuthor3.getName() + " :" + newAuthor3.calculateRoyalties() + "dkk");


    }
}
