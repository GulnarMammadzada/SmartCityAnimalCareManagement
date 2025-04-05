package VirtualZooManagement;

public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age,"Lion");
    }

    @Override
    public void makeSound(){
        System.out.println(name + " roars!");
    }

    @Override
    public void eat(){
        System.out.println(name + " eats meat.");
    }
}
