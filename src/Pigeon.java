class Pigeon extends Bird{
    private String speciesSirisa56482;

    public Pigeon() {
        super();
        speciesSirisa56482 = "none";
    }

    public Pigeon(String name, String featherColour, String species, int age, int weight) {
        super(name,featherColour, age, weight);
        this.speciesSirisa56482 = species;
    }

    public Pigeon(String featherColour,String species, int age){
        super(featherColour, age);
        this.speciesSirisa56482 = species;
    }
    //Additional
    public void MoodSirisa56482(){
        System.out.println("Pigeon are kindly");
    }

    @Override
    public void LiveSirisa56482(){
        System.out.println("Pigeon living on the tree");
    }

    @Override
    public void getVoiceSirisa56482(){
        System.out.println("Pigeon is making sound jib");
    }

    @Override
    public void eatSirisa56482(String foodName) {
        System.out.println("eats: " + foodName);
    }

    public void setSpeciesSirisa56482(String orderSirisa56482){this.speciesSirisa56482 = orderSirisa56482;}
    public String getSpeciesSirisa56482(){return speciesSirisa56482;}

    @Override
    public String toString(){
        return "Pigeon: \n" + "species: " + speciesSirisa56482;
    }
}
