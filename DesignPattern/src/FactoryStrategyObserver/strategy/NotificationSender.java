package FactoryStrategyObserver.strategy;

import FactoryStrategyObserver.NotificationSystem.Student;

public interface NotificationSender {
    public void sendNotification(Student student, String message);
}
