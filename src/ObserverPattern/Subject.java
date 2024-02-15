package ObserverPattern;

import ObserverPattern.Observer;

public interface Subject {
    void AddUser(Observer obj);
    void RemoveUser(Observer obj);
    void notifyUsers();
}
