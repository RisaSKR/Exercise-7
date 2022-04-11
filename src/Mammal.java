class Mammal extends Animal {
    private String orderSirisa56482;

    public Mammal() {
        super();
        orderSirisa56482 = " ";
    }

    public Mammal(String order, String name, int age, int weight) {
        super(name, age, weight);
        this.orderSirisa56482 = order;
    }

    public Mammal(String order, int age){
        super(age);
        this.orderSirisa56482 = order;
    }

    //additional
    public void drinkMilkSirisa56482(){
        System.out.println("Sip Sip");
    }

    @Override
    public void getVoiceSirisa56482(){
        System.out.println("Mammal is making sound lala");
    }

    @Override
    public void eatSirisa56482(String foodName) {
        System.out.println("eats: " + foodName);
    }

    public void setOrderSirisa56482(String orderSirisa56482){this.orderSirisa56482 = orderSirisa56482;}
    public String getOrderSirisa56482(){return orderSirisa56482;}

    @Override
    public String toString(){
        return "Mammal: \n" + "order: " + orderSirisa56482;
    }
}
