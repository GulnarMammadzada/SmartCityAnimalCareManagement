package SmartCityCitizen;

public class Doctor extends Person {

    public Doctor(String name, int age) {
        super(name, age,"Doctor");
    }

    @Override
    public void introduce(){
        System.out.println("Greetings, I'm Dr. " + name + ", here to take care of patients.");
    }

    @Override
    public void doWork(){
        System.out.println(name + " is diagnosing and treating patients.");
    }
}
