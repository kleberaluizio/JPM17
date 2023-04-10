public class SideItems {

    public enum SideItem{
        Fries(1.39),ChickeNuggets(3.29),  OnionRings(1.49);
        private double price;

        SideItem(double price){
            this.price = price;
        }

        public double getPrice(){
            return price;
        }
    }
    private SideItem sideItem;
}
