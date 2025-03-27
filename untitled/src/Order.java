import java.util.Arrays;

public class Order {
    private static int nextId = 1;
    private int id;
    private Customer customer;
    private Product[] products;
    private int[] quantities;
    private String orderDate;
    private String Status;



    public Order(Customer customer, Product[] products, int[] quantities) {
        this.id = nextId++;
        this.customer = customer;
        this.products = products;
        this.quantities = quantities;
        this.orderDate = java.time.LocalDate.now().toString();
        this.status = "New";
    }




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



    public int calculateTotalValue(){
        int total = 0;
        for (int i = 0; i < products.length; i++) {
            total += products[i].getPrice() * quantities[i];
        }
        return total;
    }




    public void applyDiscount(){
        if (customer.isLoyalCustomer()){
            for (int i = 0; i< products.length; i++){
                double newPrice = product.getPrice() * 0.90;
                products[i].setPrice(newPrice);
            }
            System.out.println("Discount applied to loyal customer");


        }
    }



    public String displayDetails(){
        return Arrays.toString(products) + Status + customer + Arrays.toString(quantities) + orderDate;
    }


}
