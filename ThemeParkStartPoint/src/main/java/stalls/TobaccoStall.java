package stalls;

public class TobaccoStall extends Stall  implements behaviours.ISecurity, behaviours.IReviewed {
    private int age;
    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean isAllowedTo() {
        if (age >18) {

        } return true;
    }

    public int getRating(){
        return 0;
    }



}
