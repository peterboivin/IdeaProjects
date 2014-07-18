package main.java.decorator;

/**
 * Created by peterboivin on 5/26/14.
 */
//Another Concrete Decorator

public class SGDDecorator extends Decorator{
    Currency currency;

    public SGDDecorator(Currency currency){
        this.currency = currency;
    }


    public String getCurrencyDescription(){
        return currency.getCurrencyDescription()+" ,its singapore Dollar";
    }

    @Override
    public double cost(double value) {
        return value * 20;
    }
}
