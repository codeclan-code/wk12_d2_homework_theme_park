package attractions;

import people.Visitor;

public class RollerCoaster  extends Attraction  implements behaviours.ISecurity, behaviours.ITicketed {
    private int height;
    private int age;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.height = height;
        this.age = age;
    }


    public boolean isAllowedTo(Visitor visitor){
        if (height > 145 && age > 12){

        }
        return true;
    }

    public double defaultPrice(){
        return 8.40;
    }

    public Double priceFor(){
        return 16.80;
    };
}
