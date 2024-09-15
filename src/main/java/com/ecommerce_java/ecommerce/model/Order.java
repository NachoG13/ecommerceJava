package com.ecommerce_java.ecommerce.model;
import java.sql.Date;

public class Order {
    private Integer idOrder;
    private String number;
    private Date creationDate;
    private Date recieveDate;

    private double total;

    public Order() {
    }

    public Order(Integer idOrder, String number, Date creationDate, Date recieveDate, double total) {
        this.idOrder = idOrder;
        this.number = number;
        this.creationDate = creationDate;
        this.recieveDate = recieveDate;
        this.total = total;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getRecieveDate() {
        return recieveDate;
    }

    public void setRecieveDate(Date recieveDate) {
        this.recieveDate = recieveDate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
