public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        this.tonerLevel = (tonerLevel < 0 || tonerLevel > 100)?1:tonerLevel;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        tonerLevel = tonerAmount + tonerLevel;
        return (tonerLevel < 0 || tonerLevel > 100)?-1: (tonerLevel);

    }
    public int printPages(int pages){
        int jobPages = (duplex)? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
 }
