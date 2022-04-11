class BlowFish extends Fish{
    private String poisonSirisa56482;

    public BlowFish() {
        super();
        poisonSirisa56482 = "none";
    }

    public BlowFish(String name,String place,String poison,int age, int weight) {
        super(name,place,age,weight);
        this.poisonSirisa56482 = poison;
    }

    public BlowFish(String place, String poison, int age){
        super(place,age);
        this.poisonSirisa56482= poison;
    }
    //Additional
    public void homeSirisa56482(){
        System.out.println("Blowfish home is in the ocean");
    }

    @Override
    public void surviveSirisa56482(){
        System.out.println("BlowFish can survive only in the water");
    }

    @Override
    public void getVoiceSirisa56482(){
        System.out.println("BlowFish is making sound %^&");
    }

    @Override
    public void eatSirisa56482(String foodName) {
        System.out.println("eats: " + foodName);
    }

    public void setPoisonSirisa56482(String breedSirisa56482){this.poisonSirisa56482 = breedSirisa56482;}
    public String getPoisonSirisa56482(){return poisonSirisa56482;}

    @Override
    public String toString(){
        return "Fish: \n" + "place: " + poisonSirisa56482;
    }
}
