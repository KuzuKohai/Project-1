
package address;

import address.data.AddressBook;
import address.data.AddressEntry;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private final AddressBook addressBook;
    private final Scanner scanner;

    public Menu(AddressBook addressBook) {
        this.addressBook = addressBook;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        int input;
        do {
            System.out.println("\nAddress Book Application");
            System.out.println("1) Read entries from a file");
            System.out.println("2) Addition");
            System.out.println("3) Removal");
            System.out.println("4) Find");
            System.out.println("5) Listing");
            System.out.println("6) Quit");
            //prints out the menu into the console

            input = scanner.nextLine();

            //chooses the action based on user input 1-6
            switch (input) {
                case 1 :
                    loadEntries();
                    break;
                case 2 :
                    String firstName = prompt_FirstName();
                    String lastName = prompt_LastName();
                    String street = prompt_Street();
                    String city = prompt_City();
                    String state = prompt_State();
                    String telephone = prompt_Telephone();
                    String email = prompt_Email();
                    var zip = 0;
                    AddressEntry entry = new AddressEntry(firstName, lastName, street, city, state, zip, telephone, email);
                    break;
                case 3 :
                    removeAddressEntry();
                    break;
                case 4 :
                    findAddressEntries();
                    break;
                case 5 :
                    listAddressEntries();
                    break;
                case 6 :
                    System.out.println("Exiting...");
                    break;

            }
        } while (input <= 1 || input >= 6 );
    }

    private void listAddressEntries() { //this lists the address entries
        System.out.println();
        List<AddressEntry> entries = addressBook.listEntries();
        int index = 1;
        //incomplete
    }

    private void removeAddressEntry() { //removes an entry
        System.out.print("Enter the first name of the entry to remove: ");
        String Name = scanner.nextLine();

        List<AddressEntry> matches = addressBook.findEntriesName(Name);

        if (matches.isEmpty()) {
            System.out.println("No entries found.");
            return;
        }

        System.out.println("Select the entry to remove:");
        for (int i = 0; i < matches.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, matches.get(i));
        }

        int choice;
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            return;
        }
        if (choice > 0 && choice <= matches.size()) {
            AddressEntry entryToRemove = matches.get(choice - 1);
            if (addressBook.removeAddress(entryToRemove)) {
                System.out.println("Entry removed successfully.");
            } else {
                System.out.println("Failed to remove entry.");
            }
        }
    }

    private void findAddressEntries() { //finds an entry
        System.out.print("Enter the name to search for: ");
        String Name = scanner.nextLine();

        List<AddressEntry> results = addressBook.findEntriesByName(Name);

        if (results.isEmpty()) {
            System.out.println("There were no entries found from " + Name);
        } else {
            System.out.println("There were " + results.size() + " entries that were found.");
        }
            System.out.println("The entry was found.");
        }

    }

    /** HERE ARE THE USER PROMPTS FOR DATA ENTRY **/

    private void loadEntries() { //loads the entries from a file
        System.out.print("Please enter the file name: ");
        String fileName = scanner.nextLine();
        addressBook.loadFromFile(fileName);
    }

    private String prompt_FirstName() { //prompts user to enter the first name
        System.out.println();
        System.out.print("Enter first name: ");
        return scanner.nextLine();
    }

    private String prompt_LastName() { //promts user to enter the last name
        System.out.print("Enter last name: ");
        return scanner.nextLine();
    }

    private String prompt_Street() { //prompt user to enter the street name
        System.out.print("Enter street: ");
        return scanner.nextLine();
    }

    private String prompt_City() { //prompts user to enter city name
        System.out.print("Enter city: ");
        return scanner.nextLine();
    }

    private String prompt_State() { //prompts user to enter state name
        System.out.print("Enter state: ");
        return scanner.nextLine();
    }

    private int prompt_Zip() { //prompts user to enter zip code
        System.out.print("Enter zip code: ");
        return scanner.nextInt();
    }

    private String prompt_Telephone() { //prompts user to enter telephone number
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter telephone: ");
        return scanner.nextLine();
    }

    private String prompt_Email() { //prompts user to enter email address
        System.out.print("Enter email: ");
        return scanner.nextLine();
    }
}