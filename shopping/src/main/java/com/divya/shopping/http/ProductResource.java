package com.divya.shopping.http;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.divya.shopping.entity.Product;
import com.divya.shopping.entity.impl.ProductImpl;
import com.divya.shopping.http.entity.HttpProduct;
import com.divya.shopping.service.ProductService;

@Path("product")
@Component
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class ProductResource {
	
	@Autowired
	private ProductService productService;
	
	@GET
	public List<HttpProduct> getProducts(){
		List<Product> products = productService.getProducts();
		List<HttpProduct> httpProducts = convert(products);
		return httpProducts;
	}
	@POST
	public HttpProduct addProduct(HttpProduct httpProduct){
		productService.addProduct(convert(httpProduct));
		return httpProduct;
	}
	
	@DELETE
	public void deleteProduct(HttpProduct httpProduct){
		productService.deleteProduct(convert(httpProduct));
	}
	
	@PUT
	public void updateProduct(HttpProduct httpProduct){
		productService.updateProduct(convert(httpProduct));
	}
	
	public static List<HttpProduct> convert(List<Product> products){
		List<HttpProduct> httpProduct = new ArrayList<>();
		for(Product product : products){
			HttpProduct prd = new HttpProduct(product);
			httpProduct.add(prd);
		}
		return httpProduct;
	}
	
	private Product convert(HttpProduct httpProduct){
		ProductImpl product = new ProductImpl();
		product.setCategory(httpProduct.category);
		product.setProductId(httpProduct.productId);
		product.setProductName(httpProduct.productName);
		product.setProductPrice(httpProduct.productPrice);
		product.setProductDescription(httpProduct.productDescription);
		product.setProductStock(httpProduct.productStock);
		return product;
	}
	

}
