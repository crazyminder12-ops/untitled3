public class Customer {

    private int id;
    private String name;
    private double money;
    private int discount;

    public Customer(int id, String name, double money, int discount) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.discount = discount;
    }

    public Customer() {
        id = 0;
        name = "none";
        money = 0;
        discount = 0;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public int getDiscount() {
        return discount;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setMoney(double money) {
        if (money >= 0) {
            this.money = money;
        }
    }

    public void setDiscount(int discount) {
        if (discount >= 0 && discount <= 100) {
            this.discount = discount;
        }
    }

    // logic methods
    public void spend(double sum) {
        if (sum <= money) {
            money -= sum;
        }
    }

    public double getPriceWithDiscount(double price) {
        return price - (price * discount / 100.0);
    }

    @Override
    public String toString() {
        return "Customer{id=" + id + ", name='" + name + '\'' + ", money=" + money + ", discount=" + discount + "%}";
                
    }
}
