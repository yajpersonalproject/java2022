public class c5q1{
    public static void main(String[] args){
        double sum = 0;
        for(int i = 1; i < 101; i++){
            sum += 1/(Math.pow(5, i));
        }
        IBIO.output(sum);
    }
    }
