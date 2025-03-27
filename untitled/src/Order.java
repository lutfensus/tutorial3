import java.util.Arrays;

public class Order {
    private int id;
    private Customer customer;
    private Product[] products;
    private int[] quantities;
    private String orderDate;
    private String Status;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int[] getQuantities() {
        return quantities;
    }

    public void setQuantities(int[] quantities) {
        this.quantities = quantities;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }



    public int calculateTotalValue(){}




    public void applyDiscount(){
        if (customer.isLoyalCustomer()){
            double newPrice = product.getPrice() * 0.90;
            product.setPrice(newPrice);
        }
    }



    public String displayDetails(){
        return Arrays.toString(products) + Status + customer + Arrays.toString(quantities) + orderDate;
    }


}
