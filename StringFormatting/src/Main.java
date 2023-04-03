public class Main {

    public static void main (String[] args){
        String bulletIt = "Print a Bulleted list: \n" +
                "\t\u2022  First Point \n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt + "\n ");

        String textBlock = """
                Print a Bulleted List:
                    \u2022 Fist Point
                        \u2022 Sub Point""";

        System.out.println(textBlock);

    }
}
