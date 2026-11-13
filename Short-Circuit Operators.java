
public class ShortCircuit {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        if (a > 5 && b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("Division not possible");
        }
    }
}
