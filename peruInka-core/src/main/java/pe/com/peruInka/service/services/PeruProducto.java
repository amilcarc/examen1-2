package pe.com.peruInka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.com.peruInka.service.util.Product;

@Service("peruProducto")
public class PeruProducto {

public static List<Product> prod = new ArrayList<Product>();
	
	public void saveProduct(Product product){
		prod.add(product);
	}
	
	public List<Product> findAllProduct(){
		return prod;
	}
	
	public void updateProduct(Product productUpdate){
		List<Product> listTemp = new ArrayList<Product>();
		
		for (Product product : prod) {
			if(productUpdate.getId().compareTo(product.getId())==0){
				listTemp.add(productUpdate);
			}else{
				listTemp.add(product);
			}
		}
		prod = new ArrayList<Product>();
		prod.addAll(listTemp);

	}
	
	public Product searchProduct(Long id){
		Product productReturn = new Product();
		for (Product product : prod) {
			if(id.compareTo(product.getId())==0){
				productReturn = product;
				continue;
			}
		}
		return productReturn;
	}
	
	public void deleteProduct(Long id){
		List<Product> listTemp = new ArrayList<Product>();
		
		for (Product product : prod) {
			if(id.compareTo(product.getId())!=0){
				listTemp.add(product);
			}
		}
		prod = new ArrayList<Product>();
		prod.addAll(listTemp);
	}
}