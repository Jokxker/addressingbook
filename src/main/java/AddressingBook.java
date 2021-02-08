import java.util.ArrayList;

public class AddressingBook {
    private String lastNamePerson;
    private String street;
    private int numHouse;
    private int numFlat;
    private static ArrayList<String> allPerson = new ArrayList<String>();

    @Override
    public String toString() {
        return "lastNamePerson = " + lastNamePerson + "street = " + street + "numHouse = " + numHouse +
                "numFlat = " + numFlat;
    }

    public String getLastNamePerson() {
        return lastNamePerson;
    }

    public AddressingBook(String lastNamePerson, String street, int numHouse, int numFlat) throws Exception {
        if (allPerson.contains(lastNamePerson)) {
            throw new Exception("Error");
        }
        this.lastNamePerson = lastNamePerson;
        this.street = street;
        this.numHouse = numHouse;
        this.numFlat = numFlat;
        allPerson.add(this.lastNamePerson);
    }

    public static ArrayList<String> getAllPerson() {
        return allPerson;
    }
}