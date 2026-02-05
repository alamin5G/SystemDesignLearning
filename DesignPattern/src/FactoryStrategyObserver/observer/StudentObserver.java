package FactoryStrategyObserver.observer;

import FactoryStrategyObserver.NotificationSystem.Student;

public interface StudentObserver {
    public void onStudentRegistered(Student student);

}
