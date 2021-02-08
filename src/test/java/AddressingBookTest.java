import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AddressingBookTest {
    @Test
    public void AddressingBook() throws Exception {
        AddressingBook person1 = new AddressingBook("Aleks", "Lenina", 56, 45);
        AddressingBook person2 = new AddressingBook("Evgen", "Parkov", 74, 4);
        ArrayList<String> allPerson = AddressingBook.getAllPerson();
        ArrayList<String> exc = new ArrayList<>();
        exc.add("Aleks");
        exc.add("Evgen");
        Assertions.assertEquals(exc, allPerson);
    }
}