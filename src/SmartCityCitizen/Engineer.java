package SmartCityCitizen;

public class Engineer extends Person {

    public Engineer(String name, int age) {
        super(name, age,"Engineer");
    }
    @Override
    public void introduce(){
        System.out.println("Hello! I'm Engineer " + name + ", and I love solving technical problems.");
    }

    @Override
    public void doWork(){
        System.out.println(name + " is designing and debugging software.");
    }


}
