package wk13;

import java.util.concurrent.atomic.AtomicLongArray;

public class Address implements Cloneable {
    private String street;
    private String city;
    private int zipcode;

    public Address(String street, String city, int zipcode) {
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }

    public Object clone() {
        Address address = null;
        try {
            address = (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            address = new Address(street, city, zipcode);
        }
        return address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return street + "\n" + city + ", " + zipcode + '\n';
    }
}
