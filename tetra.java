//Neofytos Neokleous
//C1615033
public class tetra extends fish {

    private boolean haveBrightColoredBody;

    public tetra(String name, float avgMass, String owner) {
        super(name, avgMass, owner);
        this.haveBrightColoredBody = haveBrightColoredBody;
    }

    public boolean isHaveBrightColoredBody() {
        return haveBrightColoredBody;
    }

    public void setHaveBrightColoredBody(boolean haveBrightColoredBody) {
        this.haveBrightColoredBody = haveBrightColoredBody;
    }

    public void eatsShrimp(){
        System.out.println("Tetra eats a shrimp");
    }
    @Override
    public String toString() {
        return "Name: "+ getName() + "\t(" +  ")\n"+"Average Mass: " + getAvgMass() + "\n" + getClass()+"\n"+ "Owner: "
                + getOwner() +"\n"+"Number of gills: "+ getNumGills()+ "\n"+"Have bright colored body: "+ isHaveBrightColoredBody()+"\n\n";
    }

}
