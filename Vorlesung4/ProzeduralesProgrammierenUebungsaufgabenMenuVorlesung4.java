import javax.swing.*;

import static java.lang.System.*;
import static javax.swing.JOptionPane.*;

public class ProzeduralesProgrammierenUebungsaufgabenMenuVorlesung4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        int loops = 0;

        // Endlos Schleife, weil wir ja nicht wollen, dass sich das Programm nach der selection beendet.
        while (true) {
            try {
                Object[] options = {"Aufgabe9", "Aufgabe10_for_loop", "Aufgabe10_while_loop_kopf",
                        "Aufgabe11_for_loop", "Aufgabe11_while_loop_kopf", "Aufgabe12_berechne_fakultaet",
                        "Aufgabe13_summiere_fußgesteurtes_while", "Aufgabe13_summiere_kopfgesteurtes_while",
                        "Aufgabe14_wuerfel_kopfgesteurtes_while", "Aufgabe15_wuerfel_produkt_summe_kopfgesteurtes_while",
                        "Aufgabe16_iban_kopfgesteurtes_while", "Aufgabe17_groß_umgekehrte_Reihenfolge", "Aufgabe18_1x1_Matrix",
                        "Aufgabe19_Schachbrett_Matrix", "Aufgabe20_Fibonacci_Zahlen", "Aufgabe21_Grösster_Gemeinsamer_Teiler",
                        "Aufgabe22_Dreiecke_Optional", "Aufgabe22_Dreiecke_Optional_Erweiterung"};
                Object selectionObject = showInputDialog(frame, "Aufgabe auswählen", "Prozedurales Programmieren Menü", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                String selectionString = selectionObject.toString();
                if (loops == 0) {
                    System.out.print("\n");
                } else {
                    System.out.print("\n\n");
                }
                for (int i = 0; i < 77; i++) {
                    System.out.print("=");
                }
                loops++;
                System.out.println();
                switch (selectionString) {
                    case "Aufgabe9":
                        aufgabe9();
                        break;
                    case "Aufgabe10_for_loop":
                        aufgabe10_for_loop();
                        break;
                    case "Aufgabe10_while_loop_kopf":
                        aufgabe10_while_loop_kopf();
                        break;
                    case "Aufgabe11_for_loop":
                        Aufgabe11_for_loop();
                        break;
                    case "Aufgabe11_while_loop_kopf":
                        Aufgabe11_while_loop_kopf();
                        break;
                    case "Aufgabe12_berechne_fakultaet":
                        Aufgabe12_berechne_fakultaet();
                        break;
                    case "Aufgabe13_summiere_fußgesteurtes_while":
                        Aufgabe13_summiere_fußgesteurtes_while();
                        break;
                    case "Aufgabe13_summiere_kopfgesteurtes_while":
                        Aufgabe13_summiere_kopfgesteurtes_while();
                        break;
                    case "Aufgabe14_wuerfel_kopfgesteurtes_while":
                        Aufgabe14_wuerfel_kopfgesteurtes_while();
                        break;
                    case "Aufgabe15_wuerfel_produkt_summe_kopfgesteurtes_while":
                        Aufgabe15_wuerfel_produkt_summe_kopfgesteurtes_while();
                        break;
                    case "Aufgabe16_iban_kopfgesteurtes_while":
                        Aufgabe16_iban_kopfgesteurtes_while();
                        break;
                    case "Aufgabe17_groß_umgekehrte_Reihenfolge":
                        Aufgabe17_groß_umgekehrte_Reihenfolge();
                        break;
                    case "Aufgabe18_1x1_Matrix":
                        Aufgabe18_1x1_Matrix();
                        break;
                    case "Aufgabe19_Schachbrett_Matrix":
                        Aufgabe19_Schachbrett_Matrix();
                        break;
                    case "Aufgabe20_Fibonacci_Zahlen":
                        Aufgabe20_Fibonacci_Zahlen();
                        break;
                    case "Aufgabe21_Grösster_Gemeinsamer_Teiler":
                        Aufgabe21_Grösster_Gemeinsamer_Teiler();
                        break;
                    case "Aufgabe22_Dreiecke_Optional":
                        Aufgabe22_Dreiecke_Optional();
                        break;
                    case "Aufgabe22_Dreiecke_Optional_Erweiterung":
                        Aufgabe22_Dreiecke_Optional_Erweiterung();
                        break;
                }
                for (int i = 0; i < 77; i++) {
                    System.out.print("=");
                }
            } catch (Exception e) {
                exit(-1);
            }
        }
    }

    //Code der in der 4. Vorlesung behandelt wurde
    public static void aufgabe9() {
        for (int i = 1; i <= 100; i++) {
            int min = -6;
            int max = 6;
            int zufallswerte = (int) ((Math.random() * (max - min)) + min);
            System.out.println(zufallswerte);
        }
    }

    public static void aufgabe10_for_loop() {
        int eingabe = Integer.parseInt(showInputDialog("Bitte geben Sie eine Zahl ein: "));

        for (int i = 1; i <= eingabe; i++) {
            System.out.println("*");
        }
    }

    public static void aufgabe10_while_loop_kopf() {
        int eingabe = Integer.parseInt(showInputDialog("Bitte geben Sie eine Zahl ein: "));
        int durchlauf = 1;

        while (durchlauf <= eingabe) {
            System.out.println("*");
            durchlauf++;
        }
    }

    public static void Aufgabe11_for_loop() {
        int zeilenAnzahl = Integer.parseInt(showInputDialog("Bitte geben Sie eine Zeilenanzahl ein: "));
        int spaltenAnzahl = Integer.parseInt(showInputDialog("Bitte geben Sie eine Spaltenanzahl ein: "));

        for (int i = 1; i <= zeilenAnzahl; i++) {
            String ausgabe = "";
            for (int b = 1; b <= spaltenAnzahl; b++) {
                ausgabe = ausgabe + "*";
            }
            System.out.println(ausgabe);
        }
    }

    public static void Aufgabe11_while_loop_kopf() {
        int zeilenAnzahl = Integer.parseInt(showInputDialog("Bitte geben Sie eine Zeilenanzahl ein: "));
        int spaltenAnzahl = Integer.parseInt(showInputDialog("Bitte geben Sie eine Spaltenanzahl ein: "));

        int durchlauf_1 = 1;
        while (durchlauf_1 <= zeilenAnzahl) {
            String ausgabe = "";
            int durchlauf_2 = 1;
            while (durchlauf_2 <= spaltenAnzahl) {
                ausgabe = ausgabe + "*";
                durchlauf_2++;
            }
            System.out.println(ausgabe);
            durchlauf_1++;
        }
    }

    public static void Aufgabe12_berechne_fakultaet() {
        int zahl = Integer.parseInt(showInputDialog("Bitte geben Sie eine Zahl ein: "));
        int fakultaet = 1;

        for (int i = 1; i <= zahl; i++) {
            System.out.println(i);
            fakultaet = fakultaet * i;
        }
        System.out.println("Die Fakultät von " + zahl + " ist: " + fakultaet);
    }

    public static void Aufgabe13_summiere_fußgesteurtes_while() {
        int eingabe = Integer.parseInt(showInputDialog("Bitte geben Sie eine Zahl ein: "));
        int anzahl_zahlen = 0;
        int summe = eingabe;

        do {
            eingabe = Integer.parseInt(showInputDialog("Bitte geben Sie eine Zahl ein: "));
            summe += eingabe;
            anzahl_zahlen++;
        } while (eingabe != 0);

        double mittelwert = (double) summe / anzahl_zahlen;
        System.out.println("Es wurden " + anzahl_zahlen + " Zahlen eingegeben.\nDie Summe der Zahlen beträgt: " + summe + "\nDer Mittelwert ist: " + mittelwert);
    }

    public static void Aufgabe13_summiere_kopfgesteurtes_while() {
        int eingabe = Integer.parseInt(showInputDialog("Bitte geben Sie eine Zahl ein: "));
        int anzahl_zahlen = 0;
        int summe = eingabe;

        while (eingabe != 0) {
            eingabe = Integer.parseInt(showInputDialog("Bitte geben Sie eine Zahl ein: "));
            summe += eingabe;
            anzahl_zahlen++;
        }

        double mittelwert = (double) summe / anzahl_zahlen;
        System.out.println("Es wurden " + anzahl_zahlen + " Zahlen eingegeben.\nDie Summe der Zahlen beträgt: " + summe + "\nDer Mittelwert ist: " + mittelwert);
    }

    public static void Aufgabe14_wuerfel_kopfgesteurtes_while() {
        int summe = 0;
        int versuche = 0;

        while (summe != 20) {
            summe = 0;
            String ausgabe = "";
            versuche++;
            for (int i = 1; i <= 4; i++) {
                int randomAuge = (int) (Math.random() * 6 + 1);
                summe += randomAuge;
                ausgabe = ausgabe + randomAuge + " ";
            }
            System.out.println(ausgabe + " " + summe);
        }
        System.out.println("------------------------------------\n\nVersuche: " + versuche);
    }

    public static void Aufgabe15_wuerfel_produkt_summe_kopfgesteurtes_while() {
        int summe = 0;
        int produkt = 1;
        int versuche = 0;

        while (summe != 22 || produkt != 88) {
            summe = 0;
            produkt = 1;
            String ausgabe = "";
            versuche++;
            for (int i = 1; i <= 6; i++) {
                int randomAuge = (int) (Math.random() * 6 + 1);
                summe += randomAuge;
                produkt *= randomAuge;
                ausgabe = ausgabe + randomAuge + " ";
            }
            System.out.println(ausgabe + " " + summe + "  " + produkt);
        }
        System.out.println("------------------------------------\n\nVersuche: " + versuche);
    }

    public static void Aufgabe16_iban_kopfgesteurtes_while() {
        String laenderkuerzel = showInputDialog("Bitte geben Sie Ihr Länderkürzel ein: ").toUpperCase();
        int bankleitzahl = Integer.parseInt(showInputDialog("Bitte geben Sie Ihre Bankleitzahl ein: "));
        String kontonummer = showInputDialog("Bitte geben Sie Ihre Kontonummer ein: ");
        while (kontonummer.length() < 10) {
            kontonummer = "0" + kontonummer;
        }
        char l1 = laenderkuerzel.charAt(0);
        char l2 = laenderkuerzel.charAt(1);
        int asciiL1 = Character.getNumericValue(l1);
        int asciiL2 = Character.getNumericValue(l2);
        String iban = "" + bankleitzahl + kontonummer + asciiL1 + asciiL2 + "00";
        int zwischenwert1 = Integer.parseInt(iban.substring(0, 9)) % 97;
        iban = iban.replaceFirst("0", String.valueOf(zwischenwert1));
        int zwischenwert2 = Integer.parseInt(iban.substring(8, 17)) % 97;
        iban = iban.replaceFirst("76", String.valueOf(zwischenwert2));
        int zwischenwert3 = Integer.parseInt(iban.substring(15, 24)) % 97;
        iban = iban.replaceFirst("40", String.valueOf(zwischenwert3));
        int zwischenwert4 = Integer.parseInt(iban.substring(22, 25)) % 97;
        int pruefsumme = 98 - zwischenwert4;
        String ibanAus = "";
        iban = laenderkuerzel + pruefsumme + bankleitzahl + kontonummer;
        ibanAus += iban.substring(0, 4);
        ibanAus += " " + iban.substring(4, 8);
        ibanAus += " " + iban.substring(8, 12);
        ibanAus += " " + iban.substring(12, 16);
        ibanAus += " " + iban.substring(16, 20);
        ibanAus += " " + iban.substring(20, 22);

        System.out.println(ibanAus);
    }

    public static void Aufgabe17_groß_umgekehrte_Reihenfolge() {
        String text = showInputDialog("Bitte geben Sie einen Text ein: ").toUpperCase();
        String umgekehrt = "";

        for (int j = text.length() - 1; j >= 0; j--) {
            umgekehrt += text.charAt(j);
        }

        umgekehrt = umgekehrt.replace(" ", "");
        System.out.println(umgekehrt);
    }

    public static void Aufgabe18_1x1_Matrix() {
        String ausgabeHeader = "";
        String ausgabe = "";
        String einMalEins = "";

        for (int i = 1; i <= 10; i++) {
            ausgabeHeader += " " + i + "\t";
            ausgabe += " " + i + "\t" + "|";
            for (int j = 1; j <= 10; j++) {
                einMalEins = ("\t" + (i * j));
                ausgabe += einMalEins;
            }
            ausgabe += "\n";
        }
        ausgabeHeader += "\n------------------------------------------------\n";
        System.out.println(ausgabeHeader + ausgabe);
    }

    public static void Aufgabe19_Schachbrett_Matrix() {
        String ausgabe = "";

        for (int i = 0; i <= 7; i++) {
            for (int j = i + 1; j <= i + 8; j++) {
                ausgabe += j + "\t";
            }
            ausgabe += "\n";
        }
        System.out.println(ausgabe);
    }

    public static void Aufgabe20_Fibonacci_Zahlen() {
        int zahl = Integer.parseInt(showInputDialog("Bitte geben Sie eine Zahl >= 2 ein: "));
        int fib1 = 0;
        int fib2 = 1;
        int fib3;

        if (zahl >= 2) {
            for (int i = 1; i < zahl; ++i) {
                fib3 = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib3;
            }
            System.out.println(fib2);
        } else {
            System.out.println("Gib Zahl >= 2 ein!");
        }
    }

    public static void Aufgabe21_Grösster_Gemeinsamer_Teiler() {
        int zahl1 = Integer.parseInt(showInputDialog("Bitte geben Sie die erste Zahl ein: "));
        int zahl2 = Integer.parseInt(showInputDialog("Bitte geben Sie die zweite Zahl ein: "));
        int eingabeZahl1 = zahl1, eingabeZahl2 = zahl2;

        while (zahl2 != 0) {
            if (zahl1 > zahl2) {
                zahl1 = zahl1 - zahl2;
            } else {
                zahl2 = zahl2 - zahl1;
            }
        }
        System.out.println("Der GGT von " + eingabeZahl1 + " und " + eingabeZahl2 + " ist: " + zahl1);
    }

    public static void Aufgabe22_Dreiecke_Optional() {
        int spalten = Integer.parseInt(showInputDialog("Bitte geben Sie die Anzahl der Spalten ein: "));
        String ausgabe = "";

        for (int i = 1; i <= spalten; i++) {
            for (int j = 1; j <= i; j++) {
                ausgabe += "*";
            }
            ausgabe += "\n";
        }
        ausgabe += "\n";

        for (int i = 1; i <= spalten; i++) {
            for (int h = spalten; h >= i; h--) {
                ausgabe += "*";
            }
            ausgabe += "\n";
        }
        System.out.println(ausgabe);
    }

    public static void Aufgabe22_Dreiecke_Optional_Erweiterung() {
        int spalten = Integer.parseInt(showInputDialog("Bitte geben Sie die Anzahl der Spalten ein: "));
        String ausgabe = "";

        for (int i = 1; i <= spalten; i++) {
            for (int j = 1; j <= i; j++) {
                ausgabe += "*";
            }
            for(int k=spalten; k >= i; k--){
                ausgabe += " ";
            }
            for (int h = spalten; h >= i; h--) {
                ausgabe += "*";
            }
            for(int k=1; k <= i; k++){
                ausgabe += "  ";
            }
            for (int h = spalten; h >= i; h--) {
                ausgabe += "*";
            }
            for(int k = spalten; k >= i; k--){
                ausgabe += " ";
            }
            for (int f= 1; f <= i; f++) {
                ausgabe += "*";
            }
            ausgabe += "\n";
        }
        System.out.print(ausgabe);
    }
}
