package ca.ualberta.cs.lonelytwitter;

public class DomesticDuck extends Animal {
    public DomesticDuck(String type, String food) {
        super(type, food);
    }

    public void swim() {
        Log.d("cmput-301", "Yeah, I love to swim");
    }
}
