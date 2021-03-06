package ca.ualberta.cs.lonelytwitter;

public class Animal {
    private String type;
    private String food;

    public Animal(String type, String food) {
        this.type = type;
        this.food = food;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getType() {
        return this.type;
    }

    public String getFood() {
        return this.food;
    }

    public abstract void swim();
}
