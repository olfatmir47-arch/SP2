package bibliotekspenge_udvidelse;

public abstract class NetTitle extends Title {

    private int availability;
    private int reach;
    private int use;

    public NetTitle(String title, String literatureType, int availability, int reach, int use){

        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    public double getPseudoCopies(){

        return ((getReach() * 5) +(getAvailability() * 0.5) + getUse());

    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public int getReach() {
        return reach;
    }

    public void setReach(int reach) {
        this.reach = reach;
    }

    public int getUse() {
        return use;
    }

    public void setUse(int use) {
        this.use = use;
    }
}
