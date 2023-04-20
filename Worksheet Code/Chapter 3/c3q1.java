public class c3q1 {
    public static void main(String[] args) {
        int x;
        do {
            x = IBIO.inputInt("Enter a number greater than 0 and less than 100, and even");
        } while(x%2==0 && x>0 && x<100);
    }
}

