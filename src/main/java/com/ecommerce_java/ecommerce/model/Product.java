package com.ecommerce_java.ecommerce.model;

public class Product {
    private Integer idProduct;
    private String name;
    private String description;
    private String image;
    private String price;
    private Integer cuantity;
    //Constructor vacío
    public Product() {
    }
    //Constructor con parámetros
    public Product(Integer idProduct, String name, String description, String image, String price, Integer cuantity) {
        this.idProduct = idProduct;
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.cuantity = cuantity;
    }
    public String toString(){
        return "Producto [ id Producto= "+idProduct+", nombre= "+name+", descripción= "+description+"";
    }
    public Integer getIdProduct() {
        return idProduct;
    }
    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public Integer getCuantity() {
        return cuantity;
    }
    public void setCuantity(Integer cuantity) {
        this.cuantity = cuantity;
    }
}
