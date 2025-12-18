public class Customer {

    private int id;
    private String name;
    private double cash;
    private int purchases;

    public Customer(int id, String name, double cash, int purchases) {
        this.id = id;
        this.name = name;
        this.cash = cash;
        this.purchases = purchases;
    }

    public void spend(double sum) {
        cash -= sum;
        purchases++;
    }
}
