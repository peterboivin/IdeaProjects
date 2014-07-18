package main.java.decorator;

/**
 * Created by peterboivin on 5/26/14.
 */
public class Dollar extends Currency{
    double value;

    public Dollar () {
        description = "US Dollar";
    }

    public double cost(double v){

        return v;

    }

}