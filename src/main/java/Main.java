
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Address, Integer> costPerAddress = new HashMap<>();
        Set<String> uniqueCountries = new HashSet<>();
        costPerAddress.put(new Address("Россия", "Казань"), 2600);
        costPerAddress.put(new Address("Россия", "Москва"), 1500);
        costPerAddress.put(new Address("США", "Нью-Йорк"), 5000);
        costPerAddress.put(new Address("Франция", "Париж"), 7000);

        int totalPrice = 0;
        while (true) {
            System.out.println("Заполнение нового заказа.");
            System.out.print("Введите страну: ");
            String country = scanner.nextLine();
            System.out.print("Введите город: ");
            String city = scanner.nextLine();
            System.out.print("Введите вес (кг): ");
            int weight = Integer.parseInt(scanner.nextLine());
            Address address = new Address(country, city);
            Integer cost = costPerAddress.get(address);
            if (cost == null) {
                System.out.println("Доставки по этому адресу нет");
            } else {
                int deliveryCost = cost * weight;
                totalPrice += deliveryCost;
                System.out.println("Стоимость доставки составит: " + deliveryCost + " руб.");
                System.out.println("Общая стоимость всех доставок: " + totalPrice + " руб.");
            }
            uniqueCountries.add(country);
            System.out.println("Всего уникальных стран: " + uniqueCountries.size());
            System.out.println("Введите 'end' для завершения программы или любой символ для продолжения");
            String end = scanner.nextLine();
            if (end.toLowerCase().contains("end")) {
                break;
            }
        }

    }
}
