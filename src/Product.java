public class Product {

    private int id;
    private String name;
    private double price;
    private int amount;

    public Product(int id, String name, double price, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void addAmount(int x) {
        amount += x;
    }
}
