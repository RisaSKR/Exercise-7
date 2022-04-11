class Fish extends Animal{
    private String colourSirisa56482;

    public Fish() {
        super();
        colourSirisa56482 = "none";
    }

    public Fish(String name, String colour,int age, int weight) {
        super(name,age,weight);
        this.colourSirisa56482 = colour;
    }

    public Fish(String colour, int age){
        super(age);
        this.colourSirisa56482= colour;
    }
    //additional
    public void surviveSirisa56482(){
        System.out.println("Fish can survive only in the water");
    }

    @Override
    public void getVoiceSirisa56482(){
        System.out.println("Fish is making sound BumBum");
    }

    @Override
    public void eatSirisa56482(String foodName) {
        System.out.println("eats: " + foodName);
    }

    public void setColourSirisa56482(String breedSirisa56482){this.colourSirisa56482 = breedSirisa56482;}
    public String getColourSirisa56482(){return colourSirisa56482;}

    @Override
    public String toString(){
        return "Fish: \n" + "colour: " + colourSirisa56482;
    }
}
