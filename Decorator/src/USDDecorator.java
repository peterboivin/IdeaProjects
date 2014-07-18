/**
 * Created by peterboivin on 6/10/14.
 */
// Concrete Decorator

public class USDDecorator extends Decorator{

    Currency currency;


    public USDDecorator(Currency currency){
        this.currency = currency;
    }

    @Override
    public String getCurrencyDescription(){
        return currency.getCurrencyDescription()+" ,its US Dollar";
    }

    @Override
    public double cost(double value) {
        return value * 2;
    }

}