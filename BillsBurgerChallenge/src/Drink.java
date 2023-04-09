public class Drink {
    enum DrinkSize{
        Small(1), Medium(2), Large(3);
        private int size;

        DrinkSize(int size){
            this.size = size;
        }

        public int getSize(){
            return size;
        }
    }
    enum DrinkType{
        Coke(1), Sprite(2), DrPepper(3), Fanta(4), Water(5);
        private double value;

        DrinkType(double value){
            this.value = value;
        }
        public double getValue(){
            return value;
        }

    }

    private DrinkType drinkType;
    private double drinkPrice;
    private Size drinkSize;
    private boolean isDrinking;

    public Size getSize(){
        return drinkSize;
    }

    public void isDrinking(boolean isDrinking){
        this.isDrinking = isDrinking;
    }
    public static double getValue(){
        return 1.49;
    }

    public static double getValue(String drinkTypeChoice, String drinkSizeChoice) {

        if (drinkSizeChoice.equalsIgnoreCase(DrinkSize.Large.toString())) {
            return 1.49;
        } else if (drinkSizeChoice.equalsIgnoreCase(DrinkSize.Medium.toString())) {
            return 1.29;
        } else {
            return 1.0;
        }

    }

}
