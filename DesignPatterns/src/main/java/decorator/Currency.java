package main.java.decorator;

/**
 * Created by peterboivin on 5/26/14.
 */
public abstract class Currency {

    String description = "Unknown currency";

    public String getCurrencyDescription() {
        return description;
    }

    public abstract double cost(double value);

}