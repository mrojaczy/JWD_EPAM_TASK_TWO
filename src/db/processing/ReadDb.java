package db.processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadDb {
    public static List<String> getAllByCategory(String category) {
        List<String> products = new ArrayList<>();
        try {
            File file = new File("src/db/appliances_db.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if (data.startsWith(category)) {
                    products.add(data);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading DB file.");
            e.printStackTrace();
        }
        return products;
    }

    public static List<String> getAll() {
        List<String> products = new ArrayList<>();
        try {
            File file = new File("src/db/appliances_db.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                products.add(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading DB file.");
            e.printStackTrace();
        }
        products.removeIf(product -> product.equals(""));
        return products;
    }

    public static List<String> parseProductString(String product) {
        List<String> characteristics = new ArrayList<>();
        product = product.substring(product.indexOf(':')+2);
        String[] descriptions = product.split(", ");
        for (String description : descriptions) {
            description = description.substring(description.indexOf('=')+1);
            characteristics.add(description);
        }
        return characteristics;
    }
}
