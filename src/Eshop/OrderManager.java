
package Eshop;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    List<Order> orders=new ArrayList<Order>();
    List<Product> products=new ArrayList<Product>();
    
	public void addProduct(Product product) {
		products.add(product);
	}

        public void addOrder(Order order) {
		orders.add(order);
	}
        
	public List<Product> getListProducts() {
		return products;
	}
        
        public List<Order> getListOrders() {
		return orders;
	}
        
        public void newListProducts(){
            products=new ArrayList<Product>();
        }
}
