package SmartCityCitizen;

public abstract class Person {
    protected String name;
    protected int age;
    protected String  occupation;

    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    abstract void introduce();

    abstract void doWork();

     void rest(){
        System.out.println(name + " is resting now.");

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("🗑️ Finalizing: " + name + " the " + occupation);
    }




}
