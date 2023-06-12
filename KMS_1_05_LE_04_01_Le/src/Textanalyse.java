import java.util.Scanner;

public class Textanalyse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie einen Text ein: ");
        String user_text_input = scanner.nextLine();

        String[] textArray = user_text_input.split(" ");

        int vokale = 0, konsonanten = 0, satzzeichen = 0, textlaenge = 0, leerzeichen = 0;

        for (char i : user_text_input.toCharArray()) {
            if (i == ' ') {
                leerzeichen++;
            }
        }

        for (String wort : textArray) {
            textlaenge = textlaenge + wort.length();
            for (char c : wort.toCharArray()) {
                if (c == 'a' || c == 'A' || c == 'i' || c == 'I' || c == 'U' || c == 'u' || c == 'e'|| c == 'E'
                        || c == 'o' || c == 'O') {
                 vokale = vokale + 1;
                }
                else if (Character.isLetter(c)) {
                    konsonanten = konsonanten  + 1;
                }
                else
                    satzzeichen = satzzeichen + 1;
            }
        }

        System.out.println("Anzahl der Vokale: " + vokale);
        System.out.println("Anzahl der Konsonanten: " + konsonanten);
        System.out.println("Anzahl der Satzzeichen: " + satzzeichen);
        System.out.println("Anzahl der Leerzeichen: " + leerzeichen);
        System.out.println("Länge des Textes: " + textlaenge);
    }
}