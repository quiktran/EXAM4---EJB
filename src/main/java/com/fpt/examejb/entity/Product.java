package com.fpt.examejb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ProdID;
    private String ProdName;
    private String Description;
    private long DateOfManf;
    private double Price;

    public Product() {
    }

    public Product(String prodName, String description, double price) {
        ProdName = prodName;
        Description = description;
        DateOfManf = System.currentTimeMillis();
        Price = price;
    }

    public int getProdID() {
        return ProdID;
    }

    public void setProdID(int prodID) {
        ProdID = prodID;
    }

    public String getProdName() {
        return ProdName;
    }

    public void setProdName(String prodName) {
        ProdName = prodName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public long getDateOfManf() {
        return DateOfManf;
    }

    public void setDateOfManf(long dateOfManf) {
        DateOfManf = dateOfManf;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
