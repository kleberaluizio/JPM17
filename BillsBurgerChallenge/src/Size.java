public enum Size {
    Small(1), Medium(2), Large(3);
    private int size;

    Size(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }
}
