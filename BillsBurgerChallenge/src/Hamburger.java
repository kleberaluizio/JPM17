public class Hamburger {

    public enum BurgerType{
        BigMac(2.49),McChicken(3.99),  McMelt(3.99), QuarterPounder(3.79);
        private double value;

        BurgerType(double value){
            this.value = value;
        }

        public double getValue(){
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

    public ExtraTopping getExtra() {
        return extra;
    }
    public void setExtra(ExtraTopping extra) {
        this.extra = extra;
    }
}
