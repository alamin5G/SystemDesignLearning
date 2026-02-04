package ObserverPattern.NotificationSystem;

public class EmailNotificationObserverImpl implements NotificationObserver{

    @Override
    public void update(Student student, String message) {
        System.out.println("Student Registered: " + student.getName() + ", Email Notification for "+ student.getEmail() + " Sent with message: " + message);
    }
}
