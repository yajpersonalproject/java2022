public class c6q2 {
  public static void main(String[] args) {
    int number = 153;

    int x = number;
    int length = 1;
    int sum = 0;
    do {
      length++;
      x/=10;
      } while(x>1);
    for(int i = 0; i < length; i++){
      sum += Math.pow((double)(number%10), length);
      number /=10;
    }
      if(number == (int)sum){
        IBIO.out("true");
      } else {
         IBIO.out("false");
      }
  }
}