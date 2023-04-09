public class ExtraTopping {

    enum Extra{
        addCheese(1), addPicles(2), addBurger(3);
        private double value;

        Extra(double value){
            this.value = value;
        }

        public double getValue(){
            return value;
        }
    }

    private Extra extra;
    private double extraPrice;

    public ExtraTopping(Extra extra, double extraPrice) {
        this.extra = extra;
        this.extraPrice = extraPrice;
    }

    public static double getExtraPrice(String extraType){
        double value = Enum.valueOf(ExtraTopping.Extra.class, extraType).getValue();
        return value;
    }
}
//;