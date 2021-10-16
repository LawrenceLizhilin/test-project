package com.example.demo.entity;

public class Product {
    private String desc;
    private int price;
    private String category;
    private int inventory;
    private int safetyStock;

    public Product(){

    }

    public Product(final String desc,final int price,final String category,final int inventory,final int safetyStock){
       this.desc = desc;
       this.price = price;
       this.category = category;
       this.inventory = inventory;
       this.safetyStock = safetyStock;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public int getInventory(){
        return inventory;
    }

    public void setInventort(int inventory){
        this.inventory = inventory;
    }

    public int getSafetyStock(){
        return safetyStock;
    }

    public void setSafetyStock(int safetyStock){
        this.safetyStock = safetyStock;
    }

}
