package SmartCityCitizen;

public class Student extends Person {

    public Student(String name, int age ) {
        super(name, age, "Student");
    }

    @Override
    public void introduce(){
        System.out.println("Hey, I'm " + name + ", a student learning new things every day.");
    }

    @Override
    public void doWork(){
        System.out.println(name + " is studying for exams and doing homework.");
    }
}
