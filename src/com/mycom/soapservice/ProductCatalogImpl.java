package com.mycom.soapservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface="com.mycom.soapservice.ProductCatalog")
public class ProductCatalogImpl implements ProductCatalog {
	
	List<String> books = new ArrayList<>();
	List<String> music = new ArrayList<>();
	List<String> movies = new ArrayList<>();
	
	public ProductCatalogImpl() {
	 books.add("Harry Potter");
	 books.add("Jungle Book");
	 books.add("Cartoon book");
	 books.add("my book");
	 
	 music.add("Classic");
	 music.add("Rock");
	 music.add("Pop");
	 
	 movies.add("Jurrasic Park");
	 movies.add("Terminator");
	 movies.add("Star Trek");
	 
	}

	@Override
	public List<String> getProductCategories() {
		List<String> productCategories = new ArrayList<>();
		productCategories.add("Books");
		productCategories.add("Music");
		productCategories.add("Movies");
		return productCategories;
	}

	@Override
	public List<String> getProducts(String category) {

		switch (category.toLowerCase()) {
		case "books":
			return books;
		case "music":
			return music;
		case "movies":
			return movies;
	
		}
		return null;
	}

	@Override
	public boolean AddProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			books.add(product);
			break;
		case "music":
			music.add(product);
			break;
		case "movies":
			movies.add(product);
			break;
		default:
			return false;
		}
		return true;
	}
	
	

}
