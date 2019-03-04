//Neofytos Neokleous
//C1615033

public class pet {

    //Private member variables
    private String name;
    private float avgMass;
    private String owner;


    //Constructors
    public pet (String name, float avgMass, String owner){
        this.name = name;
        this.avgMass = avgMass;
        this.owner = owner;

    }

    // Public getter and setter for private variables

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAvgMass() {
        return avgMass;
    }

    public void setAvgMass(float avgMass) {
        this.avgMass = avgMass;
    }



    public void breath(){
        System.out.println("A pet is breathing");
    }
    @Override
    public String toString() {
        return "Name: "+ getName() + "\t(" +  ")\n"+"Average Mass: " + getAvgMass() + "\n" + getClass()+"\n"+ "Owner: " + getOwner() + "\n\n";
    }


}
