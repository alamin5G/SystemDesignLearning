package FactoryStrategyObserver.observer;

import FactoryStrategyObserver.NotificationSystem.Student;
import FactoryStrategyObserver.factory.NotificationSenderFactory;
import FactoryStrategyObserver.factory.NotificationType;
import FactoryStrategyObserver.strategy.NotificationSender;

public class NotificationObserver implements StudentObserver {
    @Override
    public void onStudentRegistered(Student student) {
        String message = "Hey,"+ student.getName() +"Welcome to the University";

        NotificationSender emailNotification = NotificationSenderFactory.createNotificationSender(NotificationType.EMAIL);
        emailNotification.sendNotification(student, message);


        NotificationSender smsNotification = NotificationSenderFactory.createNotificationSender(NotificationType.SMS);
        smsNotification.sendNotification(student, message);

    }
}
