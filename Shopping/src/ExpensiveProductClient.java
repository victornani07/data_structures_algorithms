import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExpensiveProductClient {
    public String getTheMostExpensiveProduct(String fileName) {
        double biggestPrice = 0;
        String theMostExpensiveProduct = "";

        try {
            File file = new File(fileName);

            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String product = reader.nextLine();
                String[] categories = product.split(":");
                Double price = Double.parseDouble(categories[1]);
                if(price > biggestPrice) {
                    biggestPrice = price;
                    theMostExpensiveProduct = product;
                }
            }
            reader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

        return theMostExpensiveProduct;
    }
}
