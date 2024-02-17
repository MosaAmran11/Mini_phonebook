import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MobilePhone user = new MobilePhone();

        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        System.out.println("\n\t\tWelcome to Mini Phone Book\t\t\n\n");
        while (x) {
            System.out.println("1. Add contact");
            System.out.println("2. Search by name");
            System.out.println("3. Search by number");
            System.out.println("4. Print contact");
            System.out.println("5. Edit contact");
            System.out.println("6. Delete contact");
            System.out.println("7. Restore contact");
            System.out.println("0. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = scanner.next();
                    System.out.print("Enter your number: ");
                    String number = scanner.next();
                    System.out.print("Enter your Email: ");
                    String email = scanner.next();
                    user.addContact(new Contact(name, number, email));
                    break;
                case 2:
                    System.out.println("Enter the name: ");
                    String find = scanner.next();
                    user.searchContactByName(find);

                    break;
                case 3:
                    System.out.println("Enter the number: ");
                    String findNum = scanner.next();
                    user.searchContactByPhoneNumber(findNum);
                    break;
                case 4:
                    user.printContacts();
                    break;
                case 5:
                    break;
                case 6:
                    System.out.print("Enter the name: ");
                    String del = scanner.next();
                    user.removeContact(del);
                    break;
                case 7:
                    user.restoreContact();
                    break;
                case 0:
                    x = false;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
