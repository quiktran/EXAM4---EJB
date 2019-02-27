package com.fpt.examejb.entity;

import javax.persistence.*;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int SalesmanID;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int S1No;
    private int ProdID;
    private String SalesmanName;
    private double DOS;


    public Sale() {
    }

    public Sale(int prodID, String salesmanName, double DOS) {
        ProdID = prodID;
        SalesmanName = salesmanName;
        this.DOS = DOS;
    }

    public int getSalesmanID() {
        return SalesmanID;
    }

    public void setSalesmanID(int salesmanID) {
        SalesmanID = salesmanID;
    }

    public int getS1No() {
        return S1No;
    }

    public void setS1No(int s1No) {
        S1No = s1No;
    }

    public int getProdID() {
        return ProdID;
    }

    public void setProdID(int prodID) {
        ProdID = prodID;
    }

    public String getSalesmanName() {
        return SalesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        SalesmanName = salesmanName;
    }

    public double getDOS() {
        return DOS;
    }

    public void setDOS(double DOS) {
        this.DOS = DOS;
    }
}
