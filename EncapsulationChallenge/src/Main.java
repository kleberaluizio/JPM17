public class Main {
    public static void main(String[] args) {
        Printer selbet = new Printer(5,true);
        System.out.println("Initial page count = " + selbet.getPagesPrinted());


        System.out.println(selbet.addToner(25));
        System.out.println("Current job pages: "+selbet.printPages(10) + ", Printer Total: "+selbet.getPagesPrinted());
        System.out.println("Current job pages: "+selbet.printPages(13) + ", Printer Total: "+selbet.getPagesPrinted());
        System.out.println(selbet.getPagesPrinted());

        System.out.println("-".repeat(15));
        Printer acer = new Printer(10,false);


        System.out.println(acer.addToner(25));
        System.out.println("Current job pages: "+acer.printPages(11) + ", Printer Total: "+acer.getPagesPrinted());
        System.out.println("Current job pages: "+acer.printPages(12) + ", Printer Total: "+acer.getPagesPrinted());
        System.out.println(acer.getPagesPrinted());



    }
}
