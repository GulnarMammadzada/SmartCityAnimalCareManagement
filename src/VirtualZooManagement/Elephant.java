package VirtualZooManagement;

public class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age,"Elephant");
    }

    @Override
    public void makeSound(){
        System.out.println(name + " trumpets!");
    }

    @Override
    public void eat(){
        System.out.println(name + " eats grass.");
    }
}
