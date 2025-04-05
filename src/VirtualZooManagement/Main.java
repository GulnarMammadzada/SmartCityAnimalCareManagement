package VirtualZooManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void performTask(String task,ArrayList<Animal>animals){
        switch (task){
            case "feed":
                for(Animal animal:animals){
                    animal.feed();
                }
                break;
            case "clean":
                for(Animal animal:animals){
                    animal.clean();
                }
                break;
            case "monitor":
                for(Animal animal:animals){
                    try {
                        animal.monitor();
                    }catch (RuntimeException e){
                        System.out.println("⚠️ Error occurred: " + e.getMessage());
                    }
                }
                break;
            default:
                System.out.println("Unknown task type.");
        }
    }


    public static void main(String[] args) {
        ArrayList<Animal> animals=new ArrayList<>();

        animals.add(new Lion("Leo", 5));
        animals.add(new Elephant("Dumbo", 10));
        animals.add(new Monkey("George", 3));


        for(Animal animal:animals){
            animal.makeSound();
            animal.eat();
        }


        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose a task to perform:");
        System.out.println("1. Feed");
        System.out.println("2. Clean");
        System.out.println("3. Monitor");

        System.out.print("Your choice: ");

        int choice=scanner.nextInt();

        switch (choice){
            case 1:
                performTask("feed",animals);
                break;
            case 2:
                performTask("clean",animals);
                break;
            case 3:
                performTask("monitor",animals);
                break;
            default:
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
        }

        for(Animal animal:animals){
            animal.makeSound();
            animal.sleep();
        }

        animals = null;
        System.gc();
        System.out.println("Requested garbage collection...");


        scanner.close();
    }
}
