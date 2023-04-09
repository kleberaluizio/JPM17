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
        private int value;

        DrinkType(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private DrinkType drinkType;
    private double drinkPrice;
    private DrinkSize drinkSize;
}
