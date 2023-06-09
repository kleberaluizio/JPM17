package com.kleberaluizio;

public class StockItem implements Comparable<StockItem>{
    private final String name;
    private Double price;
    private int quantityStock;
    private int quantityReserved;

    public StockItem(String name, Double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
        this.quantityReserved = 0;
    }
    public StockItem(String name, Double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
        this.quantityReserved = 0;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public int quantityReserved() {
        return quantityReserved;
    }

    public void resetQuantityInStock(){
        this.quantityReserved = 0;
    }

    public void setPrice(Double price) {
        if (price > 0.0){
            this.price = price;
        }
    }
    public void adjustStock(int quantity){
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity >= 0) {
            this.quantityStock = newQuantity;
            quantityReserved = -quantity;
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
        System.out.println("Entering StockItem.compareTo");
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
        return this.name + " : price "+ this.price;
    }
}
