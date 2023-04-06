public class DishWasher {
    private boolean hasWorkToDo;

    public void doDishes(){
        if (! hasWorkToDo) {
            System.out.println("Doing the dishes!");
        } else {
            System.out.println("Not able to do the dishes, it has work to do!");
        }
    }
    public void hasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
