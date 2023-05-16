package com.timbuchalka;

public class MainChallenge {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread",0.86,100);
        stockList.addStock(temp);

        temp = new StockItem("cake",1.10,7);
        stockList.addStock(temp);

        temp = new StockItem("car",12.50,2);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket timsBasket = new Basket("Tim");
        sellItem(timsBasket,"car",1);
        sellItem(timsBasket,"cake",4);
        System.out.println(timsBasket);
        System.out.println("=========");

        timsBasket.cancelItem(stockList.get("car"), stockList);
        System.out.println(stockList);
        System.out.println(timsBasket);

        timsBasket.checkOut();
        timsBasket.cancelItem(stockList.get("set"), stockList);
        timsBasket.cancelItem(stockList.get("car"), stockList);
        System.out.println(stockList);
        System.out.println(timsBasket);




    }
    public static int sellItem(Basket basket, String item, int quantity){
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We don't sell "+ item);
            return 0;
        }
        if(stockList.sellStock(item, quantity) !=0){
            basket.addToBasket(stockItem,quantity);
            return quantity;
        } else if(stockList.sellStock(item, quantity) == 0){
            System.out.println("There are no more "+ item + " in stock!");

        }
        return 0;
    }
}

