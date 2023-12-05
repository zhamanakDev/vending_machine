import model.*;

public class AppRunner {

    private final Product[] products;

    private AppRunner() {
        products = new Product[]{
                new Water("Water", 'w', 20),
                new CocaCola("Coca Cola", 'c', 50),
                new Soda("Soda", 's', 30),
                new Snickers("Snickers", 'n', 80),
                new Mars("Mars", 'm', 80),
                new Pistachios("Pistachios", 'p', 130)
        };
    }

    public static void run() {
        new AppRunner().startSimulation();
    }

    private void startSimulation() {
        print("В автомате доступны:");
        showProducts();
    }

    private void showProducts() {
        for (Product product : products) {
            print(product.toString());
        }
    }

    private void print(String msg) {
        System.out.println(msg);
    }
}
