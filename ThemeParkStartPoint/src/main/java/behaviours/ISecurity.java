package behaviours;
//import behaviours.ISecurity;
import people.Visitor;

public interface ISecurity {


    public boolean isAllowedTo(Visitor visitor);
}
