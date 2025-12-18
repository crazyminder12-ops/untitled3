public class Sale {

    private int saleId;
    private Product product;
    private int count;
    private double total;

    public Sale(int saleId, Product product, int count) {
        this.saleId = saleId;
        this.product = product;
        this.count = count;
        this.total = product.getPrice() * count;
    }

    public double getTotal() {
        return total;
    }
}
