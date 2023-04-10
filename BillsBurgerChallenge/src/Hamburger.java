public class Hamburger {

    enum BurgerType{
        BigMac(2.49),McChicken(3.99),  McMelt(3.99), QuarterPounder(3.79);
        final double price;

        BurgerType(double price){
            this.price = price;
        }

        public double getPrice(){
            return price;
        }

    }
    enum Extra{
        Cheese(0.55), Picles(0.39), Burger(1.2);
        final double price;

        Extra(double price){
            this.price = price;
        }

        public double getPrice(){
            return price;
        }
    }
    private BurgerType burgerType;
    private double burgerPrice;
    private ExtraTopping extra;

    public Hamburger(BurgerType burgerType, double burgerPrice){
        this.burgerType = burgerType;
        this.burgerPrice= burgerPrice;
    }

}
