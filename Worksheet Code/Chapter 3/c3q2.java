public class c3q2 {
    public static void main(String[] args) {
      int i = 2;
      int x = IBIO.inputInt("Enter a number greater than 1: ");
      if (x <= 1) {
        IBIO.output("Invalid input. Please enter a number greater than 1.");
        return;
      }
      if (x == 2) {
        IBIO.output("2 is a prime number.");
        return;
      }
      for (i = 2; i <= x / i; i++) {
        if (x % i == 0) {
          IBIO.output(x + " is divisible by " + i + ", which is not a prime number.");
          return;
        }
      }
      IBIO.output(x + " is a prime number.");
    }
  }