package com.timbuchalka;

public class StockItem implements Comparable<StockItem>{
    private final String name;
    private Double price;
    private int quantityInStock;
    private int reserved = 0;
    ;

    public StockItem(String name, Double price) {
        this.name = name;
        this.price = price;
        this.quantityInStock = 0;
    }

    public StockItem(String name, Double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int availableQuantity() {
        return quantityInStock - reserved;
    }

    public int quantityReserved() {
        return reserved;
    }

    public int reserveStock(int quantity){
        if(quantity <= availableQuantity()){ // Use the method, not the field
            reserved += quantity;
            return quantity;
        }
        return 0;
    }
    public int unreserveStock(int quantity){
        if(quantity <= reserved){
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    public int finaliseStock(int quantity){
        if(quantity <= reserved){
            quantityInStock -=quantity;
            reserved-=quantity;
            return quantity;
        }
        return 0;
    }

    //mine
    public void resetQuantityInStock(){
        this.reserved = 0;
    }

    public void setPrice(Double price) {
        if (price > 0.0){
            this.price = price;
        }
    }
    public void adjustStock(int quantity){
        int newQuantity = this.quantityInStock + quantity;
        if(newQuantity >= 0) {
            this.quantityInStock = newQuantity;
        }
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if(obj == this){
            return true;
        }
        if((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);

    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
//        System.out.println("Entering StockItem.compareTo");
        if(this == o){
            return 0;
        }
        if(o != null){
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException(); // if you wanna use compare function, we assume o is not equal Null
    }

    @Override
    public String toString() {
        return this.name + " : price "+ this.price + ". Reserved: "+ this.reserved;
    }
}
