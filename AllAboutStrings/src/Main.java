public class Main {
    public static void main(String[] args) {

        printInformation("Hello World");
    }

    public static void printInformation (String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length-1));

        for (int i = 0; i<string.length();i++){
            System.out.println(string.charAt(i));
        }
    }
}
//Video paused at 0502
