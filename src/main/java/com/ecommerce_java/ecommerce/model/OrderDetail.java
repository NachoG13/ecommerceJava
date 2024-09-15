package com.ecommerce_java.ecommerce.model;

public class OrderDetail {
    private String idOrderDetail;
    private String name;
    private Double cuantity;
    private Double price;
    private Double total;
    public OrderDetail() {
    }
    public OrderDetail(String idOrderDetail, String name, Double cuantity, Double price, Double total) {
        this.idOrderDetail = idOrderDetail;
        this.name = name;
        this.cuantity = cuantity;
        this.price = price;
        this.total = total;
    }
    
    @Override
    public String toString() {
        return "DetailOrder [idOrderDetail=" + idOrderDetail + ", name=" + name + ", cuantity=" + cuantity + ", price="
                + price + ", total=" + total + "]";
    }
    public String getIdOrderDetail() {
        return idOrderDetail;
    }   
    public void setIdOrderDetail(String idOrderDetail) {
        this.idOrderDetail = idOrderDetail;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getCuantity() {
        return cuantity;
    }
    public void setCuantity(Double cuantity) {
        this.cuantity = cuantity;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    
}