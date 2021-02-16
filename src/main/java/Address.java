public class Address {
    private String street;
    private int numHouse;
    private int numFlat;

    public Address(String street, int numHouse, int numFlat) {
        this.street = street;
        this.numHouse = numHouse;
        this.numFlat = numFlat;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumHouse(int numHouse) {
        this.numHouse = numHouse;
    }

    public void setNumFlat(int numFlat) {
        this.numFlat = numFlat;
    }

    public String getStreet() {
        return street;
    }

    public int getNumHouse() {
        return numHouse;
    }

    public int getNumFlat() {
        return numFlat;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Address guest = (Address) obj;
        return street.equals(guest.street) && numFlat == guest.numFlat && numHouse == guest.numHouse;
    }
}
