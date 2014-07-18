/**
 * Created by peterboivin on 6/10/14.
 */
//Another Concrete Component

public class Dollar extends Currency{
    double value;

    public Dollar () {
        description = "Dollar";
    }

    public double cost(double v){
        value=v;

        return value;

    }

}
