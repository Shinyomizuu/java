import java.util.Scanner;

public class Verschlüsselung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben etwas ein was Sie Verschlüsseln möchten: ");
        String user_text = scanner.next();
        System.out.print("Geben Sie ein um wie viele Schritte sie Verschlüsseln möchten (1 bis 26): ");
        int shift = scanner.nextInt();

        char[] letterArray = new char [user_text.length()];

        for (int i = 0; i < user_text.length(); i++) {
            char c = user_text.charAt(i);

            int asciiValue = (int) c;

            int shiftedAsciiValue = asciiValue + shift;

            if (shiftedAsciiValue > 122) {
                shiftedAsciiValue = shiftedAsciiValue - 26;
            }

            char shiftedChar = (char) shiftedAsciiValue;
            letterArray[i] = shiftedChar;
            System.out.print(letterArray[i]);
        }
    }
}