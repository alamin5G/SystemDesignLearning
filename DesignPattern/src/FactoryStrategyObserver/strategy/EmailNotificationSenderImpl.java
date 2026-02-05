package FactoryStrategyObserver.strategy;


import FactoryStrategyObserver.NotificationSystem.Student;

public class EmailNotificationSenderImpl implements NotificationSender {


    @Override
    public void sendNotification(Student student, String message) {
        System.out.println("Email Notification Sending to " + student.getName() + " with message: " + message);
    }
}
