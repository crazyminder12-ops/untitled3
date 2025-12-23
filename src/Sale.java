public class Sale {

    private int id;
    private String customerName;
    private double total;
    private String status;

    public Sale(int id, String customerName, double total, String status) {
        this.id = id;
        this.customerName = customerName;
        this.total = total;
        this.status = status;
    }

    public Sale() {
        id = 0;
        customerName = "none";
        total = 0;
        status = "open";
    }

    
    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotal() {
        return total;
    }

    public String getStatus() {
        return status;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        if (customerName != null && !customerName.isEmpty()) {
            this.customerName = customerName;
        }
    }

    public void setTotal(double total) {
        if (total >= 0) {
            this.total = total;
        }
    }

    public void setStatus(String status) {
        if (status != null && !status.isEmpty()) {
            this.status = status;
        }
    }

    
    public void addToTotal(double price) {
        if (price > 0) {
            total += price;
        }
    }

    public void closeSale() {
        status = "closed";
    }

    @Override
    public String toString() {
        return id + " " + customerName + " " + total + " " + status;
    }
}
