public class c1q6 {
    public static void main(String[] args) {
        int first = 1;
        int second = 1;
        int temp = 1;
        int yur = IBIO.inputInt("How many numbers: ");
        for(int i = 0; i < yur; i++){
            IBIO.out(temp + " ");
            temp += first;
            first = second;
            second = temp;
        }
    }
}
