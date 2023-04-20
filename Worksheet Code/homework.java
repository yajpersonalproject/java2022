import java.util.Stack;

public class homework {
    public static void main(String[] args){
        Stack<Integer> newStack = new Stack<>();
        int number = 46;
        int length = 0;
        do {
            newStack.push(number % 2);
            number /= 2;
            length++;
        } while(number != 0);
        for(int i = 0; i < length; i++){
            System.out.print(newStack.pop());
        }

    }
}