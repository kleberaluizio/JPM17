public class Main {
    public static void main(String[] args) {

        printInformation("Hello World");
        printInformation("");
        printInformation("\t   \n");

        String hellowWorld = "Hello World";
        System.out.printf("index of r = %d %n", hellowWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", hellowWorld.indexOf("World"));
        System.out.println(hellowWorld.substring(6));
        System.out.printf("index of l = %d %n", hellowWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n", hellowWorld.indexOf('l',3));
        System.out.printf("index of l = %d %n", hellowWorld.lastIndexOf('l',8 ));
        System.out.println("------------");
        String helloWorldLower = hellowWorld.toLowerCase();
        if (hellowWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }

        if (hellowWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }
        System.out.println("------------");

        if (hellowWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        System.out.println("------------");

        if (hellowWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }
        System.out.println("------------");

        if (hellowWorld.contains("World")) {
            System.out.println("String contains World");
        }
        System.out.println("------------");

        if (hellowWorld.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }

    }

    public static void printInformation (String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is empty!");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is blank!");
        }

        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length-1));

/*        for (int i = 0; i<string.length();i++){
            System.out.println(string.charAt(i));
        }*/
    }
}
//Video paused at 0502
