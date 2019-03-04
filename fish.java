//Neofytos Neokleous
//C1615033
public class fish extends pet {

    // Private member variables
    private int numGills;



    public fish(String name, float avgMass, String owner) {
        super(name, avgMass, owner);
        this.numGills = numGills;

    }



    public int getNumGills() {
        return numGills;
    }

    public void setNumGills(int numGills) {
        this.numGills = numGills;
    }

    public void swims(){
        System.out.println("Fish swims");
    }


}
