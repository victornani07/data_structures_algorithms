import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AddProductsClient {
    public void addProducts(String fileName, String productName, double price, int quantity) {
        String product = productName + ":" + price + ":" + quantity;

        try {
            File file = new File(fileName);
            FileWriter fr = new FileWriter(file, true);
            fr.write(product);
            fr.write("\n");
            fr.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
