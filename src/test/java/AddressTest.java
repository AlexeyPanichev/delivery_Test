import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AddressTest {

    @Test
    public void testAddressEqualitySameValues() {
        // given
        Address address1 = new Address("Россия", "Казань");
        Address address2 = new Address("Россия", "Казань");

        // then
        assertEquals(address1, address2);
        assertEquals(address1.hashCode(), address2.hashCode());
    }

    @Test
    public void testAddressInequalityDifferentCountries() {
        // given
        Address address1 = new Address("Россия", "Казань");
        Address address2 = new Address("США", "Казань");

        // then
        assertNotEquals(address1, address2);
        assertNotEquals(address1.hashCode(), address2.hashCode());
    }

    @Test
    public void testAddressInequalityDifferentCities() {
        // given
        Address address1 = new Address("Россия", "Казань");
        Address address2 = new Address("Россия", "Москва");

        // then
        assertNotEquals(address1, address2);
        assertNotEquals(address1.hashCode(), address2.hashCode());
    }
}