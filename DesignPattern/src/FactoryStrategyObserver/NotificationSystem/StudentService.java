package FactoryStrategyObserver.NotificationSystem;

import FactoryStrategyObserver.observer.StudentObserver;

import java.util.List;

public class StudentService  {

    List<Student> students;
    List<StudentObserver> studentObservers;

    StudentService(){
        students = new java.util.ArrayList<>();
        studentObservers = new java.util.ArrayList<>();
    }

    public void registerStudent(Student student){
        students.add(student);
        notifyObservers(student);

    }

    public void addObserver(StudentObserver observer){
        studentObservers.add(observer);
    }

    public void removeObserver(StudentObserver observer){
        studentObservers.remove(observer);
    }

    public void notifyObservers(Student student){
        for(StudentObserver observer : studentObservers){
            observer.onStudentRegistered(student);
        }
    }





}
