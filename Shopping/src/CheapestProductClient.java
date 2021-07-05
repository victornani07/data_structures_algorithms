import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CheapestProductClient {
    public String getTheCheapestProduct(String fileName) {
        double smallestPrice = Double.MAX_VALUE;
        String theCheapestProduct = "";

        try {
            File file = new File(fileName);

            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String product = reader.nextLine();
                String[] categories = product.split(":");
                Double price = Double.parseDouble(categories[1]);
                if(price < smallestPrice) {
                    smallestPrice = price;
                    theCheapestProduct = product;
                }
            }
            reader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

        return theCheapestProduct;
    }
}
