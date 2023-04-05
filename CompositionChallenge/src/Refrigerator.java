public class Refrigerator {
    private boolean hasWorkToDo;

    public void orderFood(){
        if (!hasWorkToDo){
            System.out.println("Ordering food!");
        } else {
            System.out.println("Not able to order food, it has work to do!");
        }
    }

    public void hasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
