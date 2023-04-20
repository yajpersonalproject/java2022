public class c7q1 {
    public static void main(String[] args) {
      double xx = 1;
      for (int i = 0; i < 10; i++) {
        xx = xx * 3.732;
        xx = xx * 100;
        xx = (int)xx;
        xx = xx /100;
        IBIO.output(xx);
      }
  
    }
  }