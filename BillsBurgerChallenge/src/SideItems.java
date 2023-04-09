public class SideItems {

    public enum SideItem{
        Fries(1.39),ChickeNuggets(3.29),  OnionRings(1.49);
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
