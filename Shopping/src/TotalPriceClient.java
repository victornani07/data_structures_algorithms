import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TotalPriceClient {
    public double getTotalPrice(String fileName) {
        double totalPrice = 0;

        try {
            File file = new File(fileName);

            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String product = reader.nextLine();
                String[] categories = product.split(":");
                Double price = Double.parseDouble(categories[1]);
                Double quantity = (double)Integer.parseInt(categories[2]);

                totalPrice += (price * quantity);
            }

            reader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

        return totalPrice;
    }
}
