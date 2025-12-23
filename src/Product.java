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

    public Product() {
        id = 0;
        name = "none";
        price = 0;
        amount = 0;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void setAmount(int amount) {
        if (amount >= 0) {
            this.amount = amount;
        }
    }


    public void addAmount(int value) {
        if (amount + value >= 0) {
            amount += value;
        }
    }

    public double getTotalValue() {
        return price * amount;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + '\'' + ", price=" + price + ", amount=" + amount + '}';
            
              
    }
}
