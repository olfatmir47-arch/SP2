public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        Author newAuthor = new Author("Karen Blixen");
        Author newAuthor1 = new Author("H.C. Andersen");

        AudioBook aBook1 = new AudioBook("Engle og Dæmoner", "TE",132, 180);
        PrintedBook pBook1 = new PrintedBook("Engle og Dæmoner", "TE", 150, 333);
        PrintedBook pBook2 = new PrintedBook("Rip, Rap og Rup", "SKØN", 999, 55);

        PrintedBook pBook3 = new PrintedBook("Fyrtøjet", "LYRIK", 10000, 120);

        newAuthor.addTitle(aBook1);
        newAuthor.addTitle(pBook1);
        newAuthor.addTitle(pBook2);
        newAuthor1.addTitle(pBook3);

        newAuthor.calculateRoyalties();
        System.out.println("forfatter: " + newAuthor.getName() + " :" + newAuthor.calculateRoyalties() + "dkk");

        System.out.println("forfatter: " + newAuthor1.getName() + " :" + newAuthor1.calculateRoyalties() + "dkk");





    }
}
