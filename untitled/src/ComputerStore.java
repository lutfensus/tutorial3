public class ComputerStore {
    private Product[] products;
    private Customer[] customers;
    private Order[] orders;

    private int productCount;
    private int customerCount;
    private int orderCount;

    public ComputerStore() {
        products = new Product[100];
        customers = new Customer[100];
        orders = new Order[100];
        productCount = 0;
        customerCount = 0;
        orderCount = 0;
    }
    public int getProductCount() {
        return productCount;
    }

    public int getCustomerCount() {
        return customerCount;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void addProduct(Product product){
        if(productCount < products.length) {
            products[productCount] = product;
            productCount++;
            System.out.println(productCount + " " + product.getName());
        } else {
            System.out.println("You're not ebay, lose a product");
        }

    }
    public void addCustomer(Customer customer){
        if(customerCount < customers.length) {
            customers[customerCount] = customer;
            customerCount++;
            System.out.println("Customer added: " + customer.getFirstName() + " " + customer.getLastName());
        } else {
            System.out.println("ou're not ebay, lose a customer");
        }
    }
    public Order createOrder(Customer customer, Product[] products, int[] quantities){
        Order order = new Order(customer, orderProducts, quantities);
        if(orderCount < orders.length) {
            orders[orderCount] = order;
            orderCount++;
        } else {
            System.out.println("Cannot create order: Order list is full.");
        }
        return order;
    }
    public void updateStockAfterOrder(Order order){

    }

    public void hangeOrderStatus(int orderId, String newStatus){

    }

    public String displayProductsInCategory(String category){
        return null;
    }

}
