package main.java.observer;

import main.java.observer.Observer;
import main.java.observer.Subject;

import java.util.ArrayList;

/**
 * Created by peterboivin on 5/26/14.
 */
public class Loan implements Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String type;
    private float interest;
    private String bank;

    public Loan(String type, float interest, String bank) {
        this.type = type;
        this.interest = interest;
        this.bank = bank;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
        notifyObservers();
    }

    public String getBank() {
        return this.bank;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            System.out
                    .println("Notifying Observers on change in main.java.observer.Loan interest rate");
            ob.update(this.interest);
        }

    }

}