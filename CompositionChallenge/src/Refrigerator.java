public class Refrigerator {
    private boolean hasWorkToDo;

    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("Ordering food!");
            hasWorkToDo =false;
        } else {
            System.out.println("Not able to order food, it has work to do!");
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
