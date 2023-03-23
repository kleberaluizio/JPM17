public class TestingContinue {
    public static void main(String[] args) {

        int k = 1;
        boolean isReady = false;

        while (!isReady){
            k++;
            if (k % 2 == 0){

                continue;
            }
            System.out.println(k);

            if ( k >= 15){
                isReady = true;
            }

        }
    }
}
