//Neofytos Neokleous
//C1615033
public class dog extends pet {

    //private member variables
    private boolean fetch;


    //Constructors
    public dog(String name, float avgMass, String owner){
        super(name,avgMass,owner);
        this.fetch = fetch;


    }



    public boolean isFetch() {
        return fetch;
    }

    public void setFetch(boolean fetch) {
        this.fetch = fetch;
    }

    public void bark(){
        System.out.println("Dog is barking");
    }


}
