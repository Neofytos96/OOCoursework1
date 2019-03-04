//Neofytos Neokleous
//C1615033
public class cats extends pet {

    // Private member variables
    private int numMouseEaten;

    public cats(String name, float avgMass, String owner) {
        super(name, avgMass, owner);
        this.numMouseEaten = numMouseEaten;
    }

    public int getNumMouseEaten() {
        return numMouseEaten;
    }

    public void setNumMouseEaten(int numMouseEaten) {
        this.numMouseEaten = numMouseEaten;
    }
    @Override
    public String toString() {
        return "Name: "+ getName() + "\t(" +  ")\n"+"Average Mass: " + getAvgMass() + "\n" + getClass()+"\n"+ "Owner: " + getOwner() +"\n"+"Number of mouse eaten: "+ getNumMouseEaten()+ "\n\n";
    }

}
