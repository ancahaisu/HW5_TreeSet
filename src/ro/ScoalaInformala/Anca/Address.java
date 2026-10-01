package ro.ScoalaInformala.Anca;

public class Address {
    private String street;
    private int number;
    private String city;

    public Address(String street, int number, String city) {
        this.street = street;
        this.number = number;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

}
