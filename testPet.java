//Neofytos Neokleous
//C1615033

public class testPet {
    public static void main(String[] args) {
        boxer linda = new boxer("Linda", (float) 25.3, "Neo");
        spaniel bruno = new spaniel("bruno", (float)15.3,"Peter");
        guppy leo = new guppy("Nemo", 12,"Andre");
        tetra jack = new tetra("Jack", (float)0.1,"Peter");
        cats jin = new cats("Jin", 15,"John");
        siberianHusky casper = new siberianHusky("casper", 24, "Neo");
        casper.setFetch(true);
        System.out.println(casper.toString());

        jin.setNumMouseEaten(13);
        System.out.println(jin.toString());
        bruno.setCanShake(true);
        System.out.println(bruno.toString());
        jack.setNumGills(14);
        leo.setNumGills(34);
        System.out.println(linda.toString());
        System.out.println(leo.toString());
        jack.setHaveBrightColoredBody(true);
        System.out.println(jack.toString());

        //operations for boxer casper
        System.out.println("This is what Linda the boxer does:");
        linda.breath();
        linda.bark();
        linda.plays();
        linda.setAvgMass((float) 22.4);
        System.out.println("Average mass changed to: "+ linda.getAvgMass()+"\n");

        //operation for spaniel bruno
        System.out.println("This what spaniel bruno does:");
        bruno.bite();
        bruno.bark();
        bruno.breath();

        System.out.println("\n"+"This is what leo the guppy does:");
        leo.jumps();
        leo.setAvgMass((float) 0.3);

        System.out.println("\n"+"This is what jack the tetra does:");
        jack.eatsShrimp();

    }
}
