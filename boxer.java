//Neofytos Neokleous
//C1615033
public class boxer extends dog {
    public boxer(String name, float avgMass, String owner) {
        super(name, avgMass, owner);
    }

    public void plays(){
        System.out.println("Boxer plays");
    }
    @Override
    public String toString() {
        return "Name: "+ getName() + "\t(" +  ")\n"+"Average Mass: " + getAvgMass() + "\n" + getClass()+"\n"+ "Owner: " + getOwner() +"\n"+"Can fetch: "+ isFetch()+ "\n\n";
    }

}
