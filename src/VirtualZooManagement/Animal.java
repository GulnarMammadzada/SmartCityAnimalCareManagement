package VirtualZooManagement;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    abstract void makeSound();

    abstract void eat();

    void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void feed() {
        System.out.println(name + " is being fed.");
    }

    public void clean() {
        System.out.println(name + " is being cleaned.");
    }


    public void monitor() {
        try {
            if (Math.random() > 0.5) {
                throw new RuntimeException("Unexpected zoo alert! 🚨");
            }
            System.out.println(name + " is being monitored. All animals are safe. ✅");
        } catch (RuntimeException e) {
            System.out.println("⚠️ Error occurred: " + e.getMessage());
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("🐾 Finalizing: " + name + " the " + species);
    }
}