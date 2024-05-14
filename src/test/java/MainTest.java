import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MainTest {

    @Test
    public void testSameCountryAndCityInput() {
        // given
        String country = "Москва";
        String city = "Москва";

        // when
        String actualCountry = "";
        String actualCity = "";

        Scanner scanner = new Scanner(System.in);
        System.setIn(new ByteArrayInputStream((country + "\n" + city + "\n" + "1" + "\n").getBytes()));
        scanner.nextLine();
        actualCountry = scanner.nextLine();
        scanner.nextLine();
        actualCity = scanner.nextLine();

        // then
        assertEquals(country, actualCountry);
        assertEquals(city, actualCity);
    }
}