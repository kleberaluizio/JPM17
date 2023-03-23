public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }
        System.out.println("-----------");
        int k = 1;
        while (k <= 5){
            System.out.println(k);
            k++;
        }
        System.out.println("-----------");

        k = 1;
        boolean isReady = false;
        while (!isReady){
            System.out.println(k);
            k++;
            if ( k > 5){
                isReady = true;
            }
        }

        System.out.println("----- Do While is executed at least once------");

        k = 1;
        isReady = false;
        do {
            System.out.println(k);
            k++;
            if ( k > 5){
                isReady = true;
            }
        } while (!isReady);
    }
}
