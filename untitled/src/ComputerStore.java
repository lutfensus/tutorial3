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
        Order order = new Order(customer, products, quantities);
        if(orderCount < orders.length) {
            orders[orderCount] = order;
            orderCount++;
        } else {
            System.out.println("Cannot create order: List is full.");
        }
        return order;
    }  // SMT WEIRD LOOK AGAIN!
    public void updateStockAfterOrder(Order order){
        Product[] orderProducts = order.getProducts();
        int[] orderQuantities = order.getQuantities();
        for (int i = 0; i < orderProducts.length; i++) {
            Product p = orderProducts[i];
            int qty = orderQuantities[i];
            p.setStockQuantity(p.getStockQuantity() - qty);
        }
        System.out.println("Stock updated automatically.");
    }

    public void changeOrderStatus(int orderId, String newStatus){
        for (int i = 0; i < orderCount; i++) {
            if(orders[i].getId() == orderId) {
                orders[i].setStatus(newStatus);
                System.out.println("Order status changed for order id " + orderId);
                return;
            }
        }
        System.out.println("Order with id " + orderId + " not found.");

    }

    public String displayProductsInCategory(String category){
        String result = "";
        for (int i = 0; i < productCount; i++) {
            if(products[i].getCategory().equalsIgnoreCase(category)) {
                result += products[i].displayInfo() + "\n";
            }
        }
        System.out.println("Products in category " + category + ":\n" + result);
        return result;
    }


    public void displayCustomerOrders(int customerId){
        System.out.println("Orders for customer id " + customerId + ":");
        for (int i = 0; i < orderCount; i++) {
            if(orders[i].getCustomer().getId() == customerId){
                System.out.println(orders[i].displayDetails());
            }
        }
    }

}
