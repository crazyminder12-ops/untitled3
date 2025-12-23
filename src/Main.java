public class Main {

    public static void main(String[] args) {

        Product p1 = new Product(1, "Milk", 500, 5);
        Product p2 = new Product();

        Customer c1 = new Customer(1, "Liman", 3000, 10);
        Customer c2 = new Customer();

        Sale s1 = new Sale(1, c1.getName(), 0, "open");

        // initial state
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(s1);

        
        p2.setName("Bread");
        p2.setPrice(200);
        p2.setAmount(10);

        c2.setName("Ali");
        c2.setMoney(1500);
        c2.setDiscount(5);

        
        int count = 2;
        double sum = p1.getPrice() * count;

        p1.addAmount(-count);
        c1.spend(sum);
        s1.addToTotal(sum);
        s1.closeSale();

        // final state
        System.out.println(p1);
        System.out.println(c1);
        System.out.println(s1);
    }
}
