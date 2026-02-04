package ObserverPattern.NotificationSystem;

public class MainNotificationSystem {
    public static void main(String[] args) {

        Student student1 = new Student("Alamin", "malaminswe@gmail.com", "01712345678");
        Student student2 = new Student("Jahid", "jahid@gmail.com", "01812345678");

        StudentService studentService = new StudentService();
        studentService.registerObserver(new EmailNotificationObserverImpl());
        studentService.registerObserver(new SmsNotificationObserverImpl());
        studentService.registerStudent(student1);
        studentService.registerStudent(student2);



    }


}
