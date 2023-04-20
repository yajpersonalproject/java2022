public class c3q4 {
    public static void main(String[] args) {
        int x = IBIO.inputInt("Collatz Conjecture Lol: ");
        int counter = 0;
        do {
            if(x % 2 == 0){
                x /= 2;
                counter++;
            } else {
                x = x*3 +1;
                counter++;
            }
        } while(x!=1);
        IBIO.output(counter);
    }
  }