//Neofytos Neokleous
//C1615033
public class guppy extends fish{
    public guppy(String name, float avgMass, String owner) {
        super(name, avgMass, owner);
    }
    public void jumps(){
        System.out.println("Guppy jumps");

    }
    @Override
    public String toString() {
        return "Name: "+ getName() + "\t(" +  ")\n"+"Average Mass: " + getAvgMass() + "\n" + getClass()+"\n"+ "Owner: " + getOwner() +"\n"+"Number of gills: "+ getNumGills()+ "\n\n";
    }

}
