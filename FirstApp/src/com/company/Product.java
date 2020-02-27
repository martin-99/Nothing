package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Product {
   private Document doc;
   private Element productName ;
   private Element price ;
   Double priceValue;

   public Product(String url) throws IOException {
       this.doc = Jsoup.connect(url).get();
       this.productName= doc.getElementById("title");
       this.price = doc.getElementById("priceblock_ourprice");


   }

    public Element getProductName() {
        return productName;
    }

    public Element getPrice() {
        return price;
    }

    public double priceGetValue(){
       return Double.parseDouble(getPrice().text().substring(1));
   }

}
