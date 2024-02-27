
package address.data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.io.BufferedReader;
import java.util.stream.Collectors;


public class AddressBook {
    private final List<address.data.AddressEntry> entries;

    public AddressBook() { //this creates the foundation of the addressbook
        this.entries = new ArrayList<>();
    }

    public boolean removeAddress(address.data.AddressEntry entry) { //removes an entry from the addressbook
        return entries.remove(entry);
    }

    public List<address.data.AddressEntry> findEntriesByName(String Name) { // searches for entries by name
        String searchQuery = Name;

    }

    public List<address.data.AddressEntry> listEntries() { //lists the entries in alphabetical order
        return entries.stream()
                .sorted(Comparator.comparing(address.data.AddressEntry::getLastName, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }

    public void loadFromFile(String filePath) { //loads entries from a file
        try (BufferedReader reader = new BufferedReader)
             //if
             //else System.out.println("File loaded successfully.");

    }

    public List<address.data.AddressEntry> findEntriesName(String Name) {
    }
}
