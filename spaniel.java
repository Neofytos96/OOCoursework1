//Neofytos Neokleous
//C1615033

public class spaniel extends dog {

    public boolean canShake;

    public spaniel(String name, float avgMass, String owner) {
        super(name, avgMass, owner);
        this.canShake = canShake;
    }

    public boolean isCanShake() {
        return canShake;
    }

    public void setCanShake(boolean canShake) {
        this.canShake = canShake;
    }

    public void bite(){
        System.out.println("Spaniel bites");
    }

    @Override
    public String toString() {
        return "Name: "+ getName() + "\t(" +  ")\n"+"Average Mass: " + getAvgMass() + "\n" + getClass()+"\n"+ "Owner: " + getOwner() +"\n"+"Can fetch: "+ isFetch()+ "\n"+ "Can shake:"+ isCanShake()+ "\n\n";
    }


}
