public class c5q2 {
    public static void main(String[] args){
        double sum = 0;
        for(int i = 1; i < 101; i++){
            sum += 1/(Math.pow(i, 2));
        }
        IBIO.output(sum);
    }
    }
