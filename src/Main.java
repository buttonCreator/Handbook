import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src\\Задача ВС Java Сбер.csv"));
        List<City> cities = new ArrayList<>();

        while (scanner.hasNext()) {
            String[] strSplit = scanner.nextLine().split(";");
            String name = strSplit[1];
            String region = strSplit[2];
            String district = strSplit[3];
            long population = Long.parseLong(strSplit[4]);

            String foundation;
            try {
                foundation = strSplit[5];
            } catch (ArrayIndexOutOfBoundsException e) {
                foundation = null;
            }

            cities.add(new City(name, region, district, population, foundation));
        }

        cities.forEach(System.out::println);
    }
}