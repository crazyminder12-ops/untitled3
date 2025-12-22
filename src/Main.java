public class Main {
    public static void main(String[] args) {

        Product p = new Product(1, "milk", 500, 5);
        Customer c = new Customer(1, "Yernar", 3000);

        
        System.out.println("Initial state:");
        System.out.println(p.name + " " + p.price + " " + p.amount);
        System.out.println(c.name + " " + c.money);

        int count = 2;
        double sum = p.getPrice() * count;

        p.addAmount(-count);
        c.spend(sum);

        Sale s = new Sale(1, c.name, sum);

        System.out.println("After purchase:");
        System.out.println(p.name + " " + p.amount);
        System.out.println(c.name + " " + c.money);
        System.out.println("You need to pay: " + s.total);
    }
}
