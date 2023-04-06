public class c6q3 {
    public static void main(String[] args) {

        int width = IBIO.inputInt("Enter width: ");

        for (int i = 1; i <= width; i++) {
            printSpaces(width - i);
            printStars(width);
            System.out.println();
        }

        for (int i = width - 1; i >= 1; i--) {
            printSpaces(width - i);
            printStars(width);
            System.out.println();
        }
    }

    public static void printSpaces(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
    }
}
