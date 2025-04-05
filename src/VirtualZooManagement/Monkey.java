package VirtualZooManagement;

public class Monkey extends Animal {
    public Monkey(String name, int age) {
        super(name, age,"Monkey");
    }

    @Override
    public void makeSound(){
        System.out.println(name + " screeches!");
    }

    @Override
    public void eat(){
        System.out.println(name + " eats bananas.");
    }
}
