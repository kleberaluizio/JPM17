public class CoffeeMaker {
    private boolean hasWorkToDo;

    public void brewCoffee(){
        if (hasWorkToDo) {
            System.out.println("Brewing coffee!");
            hasWorkToDo =false;
        } else {
            System.out.println("Not able to brew coffee, it has work to do!");
        }
    }
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
