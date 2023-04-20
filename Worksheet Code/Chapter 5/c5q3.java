public class c5q3 {
    public static void main(String[] args){
        double pie= 0;
        double denominator = 1;
        for(int i = 1; i < 10001; i++){
            pie += 1/denominator;
            if(denominator < 0){
                denominator = Math.abs(denominator) + 2;
            } else {
                denominator += 2;
                denominator = denominator * -1;
            }
            
        }
        IBIO.output(4*pie);
    }
    }
