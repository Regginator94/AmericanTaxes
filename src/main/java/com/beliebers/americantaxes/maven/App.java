package com.beliebers.americantaxes.maven;

import java.util.ArrayList;
import java.util.List;

import com.beliebers.americantaxes.maven.product.model.Product;

public class App 
{
	private static List<Product> productList = new ArrayList<Product>();
    public static void main( String[] args )
    {
        productList.add(new Product("Gruszki", 4.5));
        productList.add(new Product("Grzyby", 40));
        productList.add(new Product("Pizza z kurczakiem", 12.40));
        productList.add(new Product("Kiełbasa", 14.90));
        productList.add(new Product("Chleb", 2.70));
    }
}
