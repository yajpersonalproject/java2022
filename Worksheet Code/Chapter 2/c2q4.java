public class c2q4 {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            if((int)Math.pow(i, 3) < 100 && (int)Math.pow(i, 3) > 10){
                IBIO.out(" ");
            }
            if((int)Math.pow(i, 3)<10 && (int)Math.pow(i, 3)<100){
                IBIO.out("  ");
            }
            IBIO.output((int)Math.pow(i, 3));

        }
    }
}

