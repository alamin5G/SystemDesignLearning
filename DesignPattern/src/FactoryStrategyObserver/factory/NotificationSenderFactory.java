package FactoryStrategyObserver.factory;

import FactoryStrategyObserver.observer.NotificationObserver;
import FactoryStrategyObserver.strategy.EmailNotificationSenderImpl;
import FactoryStrategyObserver.strategy.NotificationSender;
import FactoryStrategyObserver.strategy.SmsNotificationSenderImpl;

public class NotificationSenderFactory {

    public static NotificationSender createNotificationSender(NotificationType notificationType) {
        if (notificationType == NotificationType.EMAIL) {
            return new EmailNotificationSenderImpl();
        } else if (notificationType == NotificationType.SMS) {
            return new SmsNotificationSenderImpl();
        }
        throw new IllegalArgumentException("Unknown Notification Type");
    }

}
