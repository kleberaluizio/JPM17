public class SideItems {

    public enum SideItem{
        Fries(2.49),ChickeNuggets(3.99),  McMelt(3.99), QuarterPounder(3.79);
        private double value;

        SideItem(double value){
            this.value = value;
        }

        public double getValue(){
            return value;
        }
    }
    private SideItem sideItem;
}
