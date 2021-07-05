public class Main {
    public static void main(String[] args) {
        String fileName = "D:\\products.txt";

        AddProductsClient addProductsClient = new AddProductsClient();
        addProductsClient.addProducts(fileName, "lapte", 4.8, 5);
        addProductsClient.addProducts(fileName, "paine", 5, 12);
        addProductsClient.addProducts(fileName, "inghetata", 3, 9);
        addProductsClient.addProducts(fileName, "biscuiti", 10, 3);
        addProductsClient.addProducts(fileName, "ciocolata", 7.2, 4);

        DeleteProductsClient deleteProductsClient = new DeleteProductsClient();
        deleteProductsClient.deleteProducts(fileName, "inghetata");

        ModifyPriceClient modifyPriceClient = new ModifyPriceClient();
        modifyPriceClient.modifyPrice(fileName, "biscuiti", 6.4);

        ModifyQuantityClient modifyQuantityClient = new ModifyQuantityClient();
        modifyQuantityClient.modifyQuantity(fileName, "ciocolata", 6);

        ExpensiveProductClient expensiveProductClient = new ExpensiveProductClient();
        System.out.println(expensiveProductClient.getTheMostExpensiveProduct(fileName));

        CheapestProductClient cheapestProductClient = new CheapestProductClient();
        System.out.println(cheapestProductClient.getTheCheapestProduct(fileName));

        TotalPriceClient totalPriceClient = new TotalPriceClient();
        System.out.println(totalPriceClient.getTotalPrice(fileName));
    }
}
