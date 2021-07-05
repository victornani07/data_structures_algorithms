import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModifyPriceClient {
    public void modifyPrice(String fileName, String productName, double newPrice) {
        List<String> newProducts = new ArrayList<>();
        try {
            File file = new File(fileName);

            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String product = reader.nextLine();
                if(product.contains(productName)) {
                    String[] categories = product.split(":");
                    categories[1] = Double.toString(newPrice);
                    String newProduct = categories[0] + ":" + categories[1] + ":" + categories[2];
                    newProducts.add(newProduct);
                } else
                    newProducts.add(product);
            }
            reader.close();

            try {
                FileWriter fr = new FileWriter(file);

                for (String product : newProducts) {
                    fr.write(product);
                    fr.write("\n");
                }

                fr.close();
            } catch(IOException ex) {
                ex.printStackTrace();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
