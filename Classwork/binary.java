package Classwork;
import java.util.Stack;

class binary {
    public static void main(String[] args) {
        Stack<Integer> newStack = new Stack<>();
        int number = 43;
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