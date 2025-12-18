public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(1, "milk", 500.0, 5);
        Customer c1 = new Customer(1, "Liman", 3000.0, 1);

        int count = 2;
        double sum = p1.getPrice() * count;

        p1.addAmount(-count);
        c1.spend(sum);

        System.out.println("total: " + sum);
        System.out.println("thank you for your purchase");
    }
}
