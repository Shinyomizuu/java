import java.util.Scanner;

public class Tabelle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie das untere Limit ein: ");
        float limit1 = scanner.nextFloat();

        System.out.print("Geben Sie das obere Limit ein: ");
        float limit2 = scanner.nextFloat();

        float diff = (limit2 - limit1) / 10;
        float value = limit1;

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%10d", i * 10);

            for (int j = 0; j <= 10; j++) {
                if (i > 0) {
                    System.out.printf("%10.0f ", value * 10 * i);
                    value += diff;
                }
                else {
                    System.out.printf("%10.1f ", value);
                    value += diff;
                }
            }
            value = limit1;
            System.out.println();
        }
    }
}