package PizzaHut;

public class Pizza {
    String type;
    String toppings;
    String name;
    float timeForPreparation;

    public Pizza(String type, String toppings, String name, float timeForPreparation) {
        this.type = type;
        this.toppings = toppings;
        this.name = name;
        this.timeForPreparation = timeForPreparation;
    }

    @Override
    public String toString(){
        return type + " " + name + " Pizza with " + toppings + " toppings which takes " + timeForPreparation + " min for preparation";
    }
}
