package Eshop;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private String id;
	private List<Product> products;
	
	public Order(List<Product> products) {
		super();
		this.id = setOrderId();
                this.products = products;
	}
        
	@Override
	public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\n Order  id:  " + id + "\n");
            String productString = "";
            for(Product product:products){
                productString = product.toString();
                stringBuilder.append("\t" + productString);
            }
		return stringBuilder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((products == null) ? 0 : products.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Order))
			return false;
		Order other = (Order) obj;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		return true;
	}
	
	//Id based on date and exact time
	private String setOrderId(){
		Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("ddMM20yyhhmmssMs");
        String datetime = ft.format(dNow);
        return datetime;
	}
	
	
}
