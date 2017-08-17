package com.mycom.soapservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
public interface ProductCatalog {
		
	@WebMethod
	public List<String> getProductCategories();	
	
	@WebMethod	
	public List<String> getProducts(String category);
	
	@WebMethod
	public boolean AddProduct(String category, String product);	

}
