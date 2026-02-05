package FactoryStrategyObserver.strategy;

import FactoryStrategyObserver.NotificationSystem.Student;

public class SmsNotificationSenderImpl implements NotificationSender {


    @Override
    public void sendNotification(Student student, String message) {
        System.out.println("SMS Notification Sending to " + student.getName() + " with message: " + message);
    }
}
