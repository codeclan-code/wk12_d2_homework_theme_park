package stalls;

public class CandyflossStall extends Stall implements behaviours.IReviewed {

    public CandyflossStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public int getRating(){
        return 0;
    };



}
