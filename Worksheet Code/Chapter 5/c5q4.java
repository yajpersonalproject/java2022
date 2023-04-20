public class c5q4 {
    public static void main(String[] args){
        double pie = 0;
        double numerator = 1;
        double denominator = 1;
        double temp1 = 0;
        double temp2= 0;
        for(int i = 0; i < 100; i++){
            pie += numerator/denominator;
            temp1 = denominator + 2;
            denominator *= temp1;
            if(denominator > 3){
                temp2 = numerator+ 2;
                numerator *= temp2;
            }
        }
        System.out.println(2*pie);
    }
    }
