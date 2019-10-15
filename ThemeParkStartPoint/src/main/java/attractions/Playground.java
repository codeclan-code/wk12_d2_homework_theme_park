package attractions;

import people.Visitor;

public class Playground extends Attraction implements behaviours.ISecurity {
    private int age;
    public Playground(String name, int rating) {
        super(name, rating);
        this.age = age;
    }

    public boolean isAllowedTo(Visitor visitor){
        if (age > 15) {
            return false;
        }
        return true;
    }
}
