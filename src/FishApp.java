import java.util.Scanner;

public class FishApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fishTankApp(scanner);

    }

    //Menu (mangler)
    public static void fishTankApp(Scanner scanner) {
        FishTank fishTank = new FishTank()
        int choice;

        while (true) {
            System.out.println("Welcome to the Fish tank App");
            System.out.println("1. View fish status");
            System.out.println("2. Update fish health");
            System.out.println("3. Change water");
            System.out.println("4. View last water change");
            System.out.println("5. Exit menu");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("List of fish status...");

                    break;
                case 2:
                    System.out.println("Updating fish health...");
                    break;
                case 3:
                    System.out.println("Changing water...");
                    break;
                case 4:
                    System.out.println("Viewing last water change...");
                    break;
                case 5:
                    System.out.println("Exited menu");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice try again!");

            }
            System.out.println("Returned to menu");
        }
    }
}