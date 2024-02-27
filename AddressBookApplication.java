

package address;

import address.data.AddressBook;
import address.data.menu;

public class AddressBookApplication {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        address.Menu menu = new address.Menu(addressBook);
        System.out.println("Welcome to Address Book Application!");
        menu.displayMenu();
    }
}
