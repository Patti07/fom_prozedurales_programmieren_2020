import javax.swing.*;

import static java.lang.System.exit;
import static javax.swing.JOptionPane.*;

public class ProzeduralesProgrammierenUebungsaufgabenMenuVorlesung3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        int loops = 0;

        // Endlos Schleife, weil wir ja nicht wollen, dass sich das Programm nach der selection beendet.
        while (true) {
            try {
                Object[] options = {"Aufgabe5", "Aufgabe6", "Aufgabe7", "Aufgabe8"};
                Object selectionObject = showInputDialog(frame, "Aufgabe auswählen", "Prozedurales Programmieren Menü", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                String selectionString = selectionObject.toString();
                if (loops == 0) {
                    System.out.print("\n");
                } else {
                    System.out.print("\n\n");
                }
                for (int i=0;i<77; i++) {
                    System.out.print("=");
                }
                loops++;
                System.out.println();
                switch (selectionString) {
                    case "Aufgabe5":
                        aufgabe5();
                        break;
                    case "Aufgabe6":
                        aufgabe6();
                        break;
                    case "Aufgabe7":
                        aufgabe7();
                        break;
                    case "Aufgabe8":
                        aufgabe8();
                        break;
                }
                for (int i=0; i<77; i++){
                    System.out.print("=");
                }
            } catch (Exception e) {
                exit(-1);
            }
        }
    }

    //Code der in der 3. Vorlesung behandelt wurde
    public static void aufgabe5() {
        System.out.println("Aufgabe5\n");
        int wuerfel1 = (int) (Math.random() * 6) + 1;
        int wuerfel2 = (int) (Math.random() * 6) + 1;
        int wuerfel3 = (int) (Math.random() * 6) + 1;
        int wuerfel4 = (int) (Math.random() * 6) + 1;
        int wuerfel5 = (int) (Math.random() * 6) + 1;
        int wuerfel6 = (int) (Math.random() * 6) + 1;
        System.out.println(wuerfel1);
        System.out.println(wuerfel2);
        System.out.println(wuerfel3);
        System.out.println(wuerfel4);
        System.out.println(wuerfel5);
        System.out.println(wuerfel6);
        System.out.println("Die Summe der Würfel beträgt " + (wuerfel1 + wuerfel2 + wuerfel3 + wuerfel4 + wuerfel5 + wuerfel6));
        System.out.println("Das Produkt der Würfel beträgt " + (wuerfel1 * wuerfel2 * wuerfel3 * wuerfel4 * wuerfel5 * wuerfel6));
    }

    public static void aufgabe6() {
        System.out.println("Aufgabe6\n");
        final double WECHSELKURS = 1.95583;
        double euro = Double.parseDouble(showInputDialog("Bitte geben Sie einen Euro Betrag ein: "));
        double umrechnungDM = euro * WECHSELKURS;
        double dmRound = Math.round(umrechnungDM * 100) / 100d;
        showMessageDialog(null, euro + " EURO entsprechen " + dmRound + " DM.", "Meldung", INFORMATION_MESSAGE);
    }

    public static void aufgabe7() {
        System.out.println("Aufgabe7\n");
        String text = showInputDialog("Bitte geben Sie einen Text ein: ");
        System.out.println(text.toUpperCase() + "\n" + text.toLowerCase() + "\n" + text.substring(0, 11) + "\n" + text.substring(5, 11) + "\n" + text.substring(10) + "\n" + text.length() + "\n" + text.contains("test"));
    }

    public static void aufgabe8() {
        System.out.println("Aufgabe8\n");
        String laenderkuerzel = showInputDialog("Bitte geben Sie Ihr Länderkürzel ein: ");
        int bankleitzahl = Integer.parseInt(showInputDialog("Bitte geben Sie Ihre Bankleitzahl ein: "));
        int kontonummer = Integer.parseInt(showInputDialog("Bitte geben Sie Ihre Kontonummer ein: "));
        char l1 = laenderkuerzel.charAt(0);
        char l2 = laenderkuerzel.charAt(1);
        int asciiL1 = Character.getNumericValue(l1);
        int asciiL2 = Character.getNumericValue(l2);
        String iban = "" + bankleitzahl + "0000" + kontonummer + asciiL1 + asciiL2 + "00";
        int zwischenwert1 = Integer.parseInt(iban.substring(0, 9)) % 97;
        iban = iban.replaceFirst("0", String.valueOf(zwischenwert1));
        int zwischenwert2 = Integer.parseInt(iban.substring(8, 17)) % 97;
        iban = iban.replaceFirst("76", String.valueOf(zwischenwert2));
        int zwischenwert3 = Integer.parseInt(iban.substring(15, 24)) % 97;
        iban = iban.replaceFirst("40", String.valueOf(zwischenwert3));
        int zwischenwert4 = Integer.parseInt(iban.substring(22, 25)) % 97;
        int pruefsumme = 98 - zwischenwert4;
        iban = "" + laenderkuerzel + pruefsumme + " " + bankleitzahl + " " + "0000" + " " + kontonummer;
        System.out.println(iban);
    }
}
