public class c1q2 {
    public static void main(String[] args) {
      int start = IBIO.inputInt("Start number: ");
      int step = IBIO.inputInt("Step: ");
      int increment = IBIO.inputInt("Increment: ");
      for (int i = 0; i < step; i++) {
        IBIO.out(start + " ");
        start += increment;
      }
    }
  }