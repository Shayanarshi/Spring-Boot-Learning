package in.ashokit.model;

public class Order {
    private  int id;
    private  String productName;
    private  int quantity;
    private  String  customerEmail;

    // no args constructor
    public  Order(){

    };
    // args - constructor
    public Order(int id,String customerEmail, String productName, int quantity) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.customerEmail = customerEmail;
    }
        // getter and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
