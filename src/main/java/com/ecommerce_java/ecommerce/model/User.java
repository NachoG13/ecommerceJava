package com.ecommerce_java.ecommerce.model;

public class User {
    private Integer idUser;
    private String userName;
    private String name;
    private String direction;
    private String age;
    private String email;
    private String nPhone;
    private String typeUser;
    private String password;

    //Constructor vacío
    public User() {
    }
    //Constructor con variables
    public User(Integer idUser, String userName, String name, String direction, String age, String email, String nPhone,
            String typeUser, String password) {
        this.idUser = idUser;
        this.userName = userName;
        this.name = name;
        this.direction = direction;
        this.age = age;
        this.email = email;
        this.nPhone = nPhone;
        this.typeUser = typeUser;
        this.password = password;
    }

    public Integer getIdUser() {
        return idUser;
    }
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDirection() {
        return direction;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getnPhone() {
        return nPhone;
    }
    public void setnPhone(String nPhone) {
        this.nPhone = nPhone;
    }
    public String getTypeUser() {
        return typeUser;
    }
    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
