public class Product {

    int id;
    String name;
    double price;
    int amount;

    public Product(int id, String name, double price, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    // getters
    int getPrice() {
        return price;
    }

    int getAmount() {
        return amount;
    }

    // setters
    void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    void setAmount(int amount) {
        if (amount >= 0) {
            this.amount = amount;
        }
    }

    void addAmount(int value) {
        amount += value;
    }
}
