/**
 * Created by peterboivin on 6/10/14.
 */
interface Currency {
    String getSymbol();
}
// Concrete Rupee Class code
class Rupee implements Currency {
    @Override
    public String getSymbol() {
        return "Rs";
    }
}

// Concrete SGD class Code
class SGDDollar implements Currency {
    @Override
    public String getSymbol() {
        return "SGD";
    }
}

// Concrete US Dollar code
class USDollar implements Currency {
    @Override
    public String getSymbol() {
        return "USD";
    }
}
