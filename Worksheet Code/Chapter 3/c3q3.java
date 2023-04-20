public class c3q3 {
    public static void main(String[] args) {
        int x = IBIO.inputInt("Enter a number: ");
        int sumcub = 0;
        do {
            sumcub += (int)Math.pow(x % 10, 3);
            x /= 10;
        } while(x>1);
        IBIO.output(sumcub);
    }
  }