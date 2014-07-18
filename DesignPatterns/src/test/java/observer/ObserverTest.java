package test.java.observer;

import main.java.observer.Internet;
import main.java.observer.Loan;
import main.java.observer.Newspaper;

/**
 * Created by peterboivin on 5/26/14.
 */
public class ObserverTest {

    public static void main(String args[]) {
        // this will maintain all loans information
        Newspaper printMedia = new Newspaper();
        Internet onlineMedia = new Internet();

        Loan personalLoan = new Loan("Personal Loan", 12.5f,
                "Standard Charterd");
        personalLoan.registerObserver(printMedia);
        personalLoan.registerObserver(onlineMedia);
        personalLoan.setInterest(3.5f);

    }
}
