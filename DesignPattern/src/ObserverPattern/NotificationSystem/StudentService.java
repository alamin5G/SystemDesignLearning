package ObserverPattern.NotificationSystem;

import java.util.List;

public class StudentService implements NotificationSubject{

    List<NotificationObserver> observers;
    List<Student> students;

    StudentService(){
     observers = new java.util.ArrayList<>();
        students = new java.util.ArrayList<>();
    }

    public void registerStudent(Student student){
        students.add(student);
        notifyObservers(student, "Welcome " + student.getName() + "! You have been successfully registered.");
    }

    @Override
    public void registerObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Student student, String message) {
        for(NotificationObserver observer : observers){
            observer.update(student, message);
        }
    }
}
