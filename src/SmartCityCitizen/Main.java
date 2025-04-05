package SmartCityCitizen;

import java.util.Scanner;

public class Main {

    public static void performRoutine(String type, Person[] people) {
        switch (type) {
            case "work":
                for (Person person : people) {
                    person.doWork();
                }
                break;

            case "rest":
                for (Person person : people) {
                    person.rest();
                }
                break;

            case "status":
                for (Person person : people) {
                    try {
                        if (Math.random() > 0.5) {
                            throw new RuntimeException("City sensor malfunction for " + person.name + "! 🚨");
                        }
                        System.out.println(person.name + " reports all systems normal. ✅");
                    } catch (RuntimeException e) {
                        System.out.println("⚠️ Status Check Error: " + e.getMessage());
                    }
                }
                break;

            default:
                System.out.println("Unknown routine type.");
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Person[] people = new Person[5];
        people[0] = new Engineer("Ali", 30);
        people[1] = new Student("Aysel", 20);
        people[2] = new Doctor("Rashid", 45);
        people[3] = new Engineer("Kamran", 35);
        people[4] = new Student("Lala", 19);



        System.out.println("Welcome to the Smart City Citizen System!");
        System.out.println("Choose a routine to perform:");
        System.out.println("1. Work Routine");
        System.out.println("2. Rest Routine");
        System.out.println("3. Daily Status");

        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();


        switch (choice) {
            case 1:
                performRoutine("work", people);
                break;

            case 2:
                performRoutine("rest", people);
                break;

            case 3:
                performRoutine("status", people);
                break;

            default:
                System.out.println("Invalid choice. Exiting...");
        }

        for (Person person : people) {
            person.introduce();
            person.doWork();
        }


        people=null;
        System.gc();



    }




}