package ObserverPattern.NotificationSystem;

public class SmsNotificationObserverImpl implements NotificationObserver{
    @Override
    public void update(Student student, String message) {
        System.out.println("Student Registered: " + student.getName() + ", SMS Notification Sent with message: " + message);
    }
}
