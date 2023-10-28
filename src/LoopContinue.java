public class LoopContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if (i == 5){
                continue; // skip the iteration where i is equal to 5
            }
            System.out.println(i);
        }
    }

}
