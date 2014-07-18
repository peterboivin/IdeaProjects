package main.java.observer; /**
 * Created by peterboivin on 5/26/14.
 */

interface Observer {
    public void update(float interest);
}

interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}







