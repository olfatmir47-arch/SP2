package bibliotekspenge;

import java.util.ArrayList;

public class Author {

     private final String name;
    private ArrayList<Title> titles = new ArrayList<>();

    public Author(String name){
        this.name = name;

    }
    public void addTitle(Title title){
        titles.add(title);

    }

    public double calculateRoyalties(){
double total = 0.0;

for(Title t: titles){
    total = t.calculateRoyalty();


} return total;
    }

   public String getName(){
        return name;
    }


}
