package main.java.observer;

import main.java.observer.Observer;

/**
 * Created by peterboivin on 5/26/14.
 */
public class Newspaper implements Observer {
    @Override
    public void update(float interest) {
        System.out.println("Newspaper: Interest Rate updated, new Rate is: "
                + interest);
    }
}
