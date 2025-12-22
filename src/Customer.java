public class Customer {

    int id;
    String name;
    double money;

    public Customer(int id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    double getMoney() {
        return money;
    }

    void setMoney(double money) {
        if (money >= 0) {
            this.money = money;
        }
    }

    void spend(double sum) {
        if (sum <= money) {
            money -= sum;
        }
    }
}
