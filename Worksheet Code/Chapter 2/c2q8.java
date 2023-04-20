public class c2q8 {
    public static void main(String[] args) {
        int x = 0;
        for(int i = 0; i< 1000000; i++){
            if(i % 2 != 0 && i % 5 != 0 &&i % 3 != 0 && i % 7 != 0){
                x++;
            }
        }
        IBIO.out(x);
    }
}

