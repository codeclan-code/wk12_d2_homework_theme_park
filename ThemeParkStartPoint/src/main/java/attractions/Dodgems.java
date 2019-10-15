package attractions;

public class Dodgems extends Attraction implements behaviours.IReviewed, behaviours.ITicketed{

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice(){
        return 4.50;
    };

    public Double priceFor(){
        return 2.25;
    };
}
