public class Hamburger {

    public enum BurgerType{
        BigMac(1),McChicken(2),  McMelt(3), QuarterPounder(4);
        private int value;

        BurgerType(int value){
            this.value = this.value;
        }

        public int getValue(){
            return value;
        }
    }
    private BurgerType burgerType;
    private double burgerPrice;
    private ExtraTopping extra;

    public Hamburger(BurgerType burgerType, double burgerPrice){
        this.burgerType = burgerType;
        this.burgerPrice= burgerPrice;
    }
    public BurgerType getBurgerType() {
        return burgerType;
    }
    public void setBurgerType(BurgerType burgerType) {
        this.burgerType = burgerType;
    }

    public double getBurgerPrice(int value) {
        return switch (value){
            case 1-> 2.49;
            case 2-> 3.99;
            case 3-> 3.99;
            case 4-> 3.79;
            default -> 0;
        };
    }
    public void setBurgerPrice(double burgerPrice) {
        this.burgerPrice = burgerPrice;
    }

    public ExtraTopping getExtra() {
        return extra;
    }
    public void setExtra(ExtraTopping extra) {
        this.extra = extra;
    }
}
