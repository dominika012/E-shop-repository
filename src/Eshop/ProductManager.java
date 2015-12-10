/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author P3502442
 */
public class ProductManager {
    List<Product> products=new ArrayList<Product>();
    List<Order> orders=new ArrayList<Order>();
    
	public void addProduct(Product product) {
		products.add(product);
	}

	public List<Product> getListProducts() {
		return products;
	}

	public void removeProduct(Product product) {
		products.remove(product);
	}
        
        public List<String> getListProductNames() {
            List<String> names=new ArrayList<String>();
            for(Product product:products){
                names.add(product.getName());
            }
		return names;
	}
        
        public Product searchByName(String name) {
            for (int i = 0; i < getListProducts().size(); i++) {
              if (getListProducts().get(i).getName() == name) {
                return getListProducts().get(i);
              }
            }
            return null;
          }
        public Product searchByString(String string) {
            
            for (int i = 0; i < getListProducts().size(); i++) {
                String productString = getListProducts().get(i).toString();
              if (productString.contains(string)) {
                return getListProducts().get(i);
              }
            }
            return null;
          }
        
}
