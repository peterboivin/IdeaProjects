package main.java.decorator;

/**
 * Created by peterboivin on 5/26/14.
 */
public class Rupee extends Currency {
    double value;

    public Rupee() {
        description = "indian rupees";
    }

    public double cost(double v){
        value=v;
        return value;
    }

}
