import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AddressingBook {
    private Map<String, Address> addressBook = new HashMap<String, Address>();

    public Map<String, Address> getAddressBook() {
        return addressBook;
    }

    public void addNameAndAddress(String lastName, String street, int numHouse, int numFlat) {
        Address address = new Address(street, numHouse, numFlat);
        addressBook.put(lastName, address);
    }

    public void removeFromAddressingBook(String lastName) {
        addressBook.remove(lastName);
    }

    public void changeAddress(String lastName, String street, int numHouse, int numFlat) {
        Address change = new Address(street, numHouse, numFlat);
        addressBook.put(lastName, change);
    }

    public Address getAddressPerson(String lastName) {
        return addressBook.get(lastName);
    }

    public ArrayList<String> getListPerson(String street) {
        ArrayList<String> listPerson = new ArrayList<>();
        for (Map.Entry<String, Address> entry : addressBook.entrySet()) {
            String addressStreet = entry.getValue().getStreet();
            if (addressStreet.equals(street)) {
                listPerson.add(entry.getKey());
            }
        }
        return listPerson;
    }

    public ArrayList<String> getListPerson(String street, int numHouse) {
        ArrayList<String> listPerson = new ArrayList<>();
        for (Map.Entry<String, Address> entry : addressBook.entrySet()) {
            String addressStreet = entry.getValue().getStreet();
            int addressNumHouse = entry.getValue().getNumHouse();
            if (addressStreet.equals(street) && addressNumHouse == numHouse) {
                listPerson.add(entry.getKey());
            }
        }
        return listPerson;
    }
}