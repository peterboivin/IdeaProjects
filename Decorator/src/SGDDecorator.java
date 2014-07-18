/**
 * Created by peterboivin on 6/10/14.
 */
//Another Concrete Decorator

public class SGDDecorator extends Decorator{
    Currency currency;

    public SGDDecorator(Currency currency){
        this.currency = currency;
    }

    @Override
    public double cost(double value) {
        return value;
    }

    @Override
    public String getCurrencyDescription() {
        return currency.getCurrencyDescription()+" ,its singapore Dollar";
    }
}
