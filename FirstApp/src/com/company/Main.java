package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
    Product picture = new Product("https://www.amazon.co.uk/Qiman-Giraffe-Diamond-Embroidery-Painting/dp/B07FSJMJ5N?pf_rd_p=bfcac438-6ed6-422f-8d29-3d29fa1d1c26&pd_rd_wg=iFcuz&pf_rd_r=FT2DSFQF1M36BEBMD5FN&ref_=pd_gw_unk&pd_rd_w=uRx1r&pd_rd_r=aee13277-13fa-43cb-9715-1cce41cfa325");
    String name = picture.getProductName().text();
    String price = picture.getPrice().text();
    double priceValue = picture.priceGetValue();
        System.out.printf("The product name is %s \n it's price is %s",name,price);

    }
}
