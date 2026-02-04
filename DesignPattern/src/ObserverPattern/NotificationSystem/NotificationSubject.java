package ObserverPattern.NotificationSystem;

public interface NotificationSubject {
    public void registerObserver(NotificationObserver observer);
    public void removeObserver(NotificationObserver observer);
    public void notifyObservers(Student student, String message);
}
