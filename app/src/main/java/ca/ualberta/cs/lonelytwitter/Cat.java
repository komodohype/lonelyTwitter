package ca.ualberta.cs.lonelytwitter;

public class Cat extends Animal {
    public Cat(String type, String food) {
        super(type, food);
    }

    public void swim() {
        Log.d("cmput-301", "Hey, I hate swimming");
    }
}
