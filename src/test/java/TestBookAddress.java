import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TestBookAddress {

    @Test
    void addNameAndAddress() {
        AddressingBook persons = new AddressingBook();
        persons.addNameAndAddress("Aleks", "Kavkas", 47, 59);
        persons.addNameAndAddress("Danil", "Pobedy", 56, 128);
        Map<String, Address> exp = new HashMap<>();
        exp.put("Aleks", new Address("Kavkas", 47, 59));
        exp.put("Danil", new Address("Pobedy", 56, 128));
        assertEquals(exp.entrySet(), persons.getAddressBook().entrySet());
    }

    @Test
    void removeFromAddressingBook() {
        AddressingBook persons = new AddressingBook();
        persons.addNameAndAddress("Aleks", "Kavkas", 47, 59);
        persons.addNameAndAddress("Danil", "Pobedy", 56, 128);
        Map<String, Address> exp = new HashMap<>();
        exp.put("Aleks", new Address("Kavkas", 47, 59));
        persons.removeFromAddressingBook("Danil");
        assertEquals(exp.entrySet(), persons.getAddressBook().entrySet());
    }

    @Test
    void changeAddress() {
        AddressingBook persons = new AddressingBook();
        persons.addNameAndAddress("Aleks", "Kavkas", 47, 59);
        persons.addNameAndAddress("Danil", "Pobedy", 56, 128);
        Map<String, Address> exp = new HashMap<>();
        exp.put("Aleks", new Address("Kavkas", 47, 59));
        exp.put("Danil", new Address("Lenina", 15, 1));
        persons.changeAddress("Danil", "Lenina", 15, 1);
        assertEquals(exp.entrySet(), persons.getAddressBook().entrySet());
    }

    @Test
    void getAddressPerson() {
        AddressingBook persons = new AddressingBook();
        persons.addNameAndAddress("Aleks", "Kavkas", 47, 59);
        Address exp = new Address("Kavkas", 47, 59);
        assertEquals(exp, persons.getAddressPerson("Aleks"));
    }

    @Test
    void getListPerson() {
        AddressingBook persons = new AddressingBook();
        persons.addNameAndAddress("Aleks", "Kavkas", 47, 59);
        persons.addNameAndAddress("Danil", "Kavkas", 56, 128);
        ArrayList<String> exp = new ArrayList<>();
        exp.add("Aleks");
        exp.add("Danil");
        assertEquals(exp, persons.getListPerson("Kavkas"));
    }

    @Test
    void testGetListPerson() {
        AddressingBook persons = new AddressingBook();
        persons.addNameAndAddress("Aleks", "Kavkas", 47, 59);
        persons.addNameAndAddress("Danil", "Kavkas", 56, 128);
        ArrayList<String> exp = new ArrayList<>();
        exp.add("Aleks");
        assertEquals(exp, persons.getListPerson("Kavkas", 47));
    }
}