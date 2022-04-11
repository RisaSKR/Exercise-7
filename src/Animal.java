abstract class Animal {
    private String nameSirisa56482;
    private int ageSirisa56482;
    private int weightSirisa56482;

    public Animal() {
        nameSirisa56482 = "none";
        ageSirisa56482 = 0;
        weightSirisa56482 = 0;
    }

    public Animal(String name, int age, int weight) {
        this.nameSirisa56482 = name;
        this.ageSirisa56482 = age;
        this.weightSirisa56482 = weight;
    }

    public Animal(int age) {
        this.ageSirisa56482 = age;
    }

    public abstract void eatSirisa56482(String foodName);
    public abstract void getVoiceSirisa56482();

    public String getNameSirisa56482() {
        return nameSirisa56482;
    }

    public void setNameSirisa56482(String nameSirisa56482) {this.nameSirisa56482 = nameSirisa56482;}
    public int getAgeSirisa56482() {return ageSirisa56482;}
    public void setAgeSirisa56482(int ageSirisa56482) {this.ageSirisa56482 = ageSirisa56482;}
    public int getWeightSirisa56482() {return weightSirisa56482;}
    public void setWeightSirisa56482(int weightSirisa56482) {this.weightSirisa56482 = weightSirisa56482;}
}