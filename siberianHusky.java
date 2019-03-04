//Neofytos Neokleous
//C1615033
public class siberianHusky extends dog {


    public siberianHusky(String name, float avgMass, String owner) {
        super(name, avgMass, owner);
    }


    public void hauling() {
        System.out.println("Only huskies haul like wolfs!");
    }
    @Override
    public String toString() {
        return "Name: "+ getName() + "\t(" +  ")\n"+"Average Mass: " + getAvgMass() + "\n" + getClass()+"\n"+ "Owner: " + getOwner() +"\n"+"Can fetch: "+ isFetch() + "\n\n";
    }


}
