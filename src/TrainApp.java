import java.util.Scanner;

public class TrainApp {

    private static TrainService trainService = new TrainService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Purchase Ticket");
            System.out.println("2. View Receipt");
            System.out.println("3. View Users by Section");
            System.out.println("4. Remove User");
            System.out.println("5. Modify Seat");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    purchaseTicket(scanner);
                    break;
                case 2:
                    viewReceipt(scanner);
                    break;
                case 3:
                    viewUsersBySection(scanner);
                    break;
                case 4:
                    removeUser(scanner);
                    break;
                case 5:
                    modifySeat(scanner);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }

    private static void purchaseTicket(Scanner scanner) {
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        User user = new User(firstName, lastName, email);
        Receipt receipt = trainService.purchaseTicket(user);
        System.out.println("Ticket Purchased: " + receipt);
    }

    private static void viewReceipt(Scanner scanner) {
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        Receipt receipt = trainService.viewReceipt(email);
        if (receipt != null) {
            System.out.println("Receipt: " + receipt);
        } else {
            System.out.println("No receipt found for the provided email.");
        }
    }

    private static void viewUsersBySection(Scanner scanner) {
        System.out.print("Enter Section (A/B): ");
        String section = scanner.nextLine();
        System.out.println("Users in Section " + section + ": " + trainService.viewUsersBySection(section));
    }

    private static void removeUser(Scanner scanner) {
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        trainService.removeUser(email);
        System.out.println("User removed.");
    }

    private static void modifySeat(Scanner scanner) {
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter New Seat (Section (A/B) & seat Number): ");
        String newSeat = scanner.nextLine();
        trainService.modifySeat(email, newSeat);
        System.out.println("Seat modified.");
    }
}
