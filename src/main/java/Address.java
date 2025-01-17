

import java.util.Objects;

public class Address {
    private String country;
    private String city;
    //private int price;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }

    @Override
    public boolean equals(Object obj) {
        Address o = (Address) obj;
        return country.equals(o.country) && city.equals(o.city);
    }
}

