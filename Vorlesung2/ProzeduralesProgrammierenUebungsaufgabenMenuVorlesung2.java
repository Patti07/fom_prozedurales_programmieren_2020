import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.exit;
import static javax.swing.JOptionPane.*;

public class ProzeduralesProgrammierenUebungsaufgabenMenuVorlesung2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        // Endlos Schleife, weil wir ja nicht wollen, dass sich das Programm nach der selection beendet.
        while (true) {
            try {
                Object[] options = {"Aufgabe1 Quader", "Aufgabe1 Quader Scanner", "Aufgabe2 Quersumme Mit Modulo Operator Auf 4 Stellen", "Aufgabe3 Double Scanner", "Aufgabe4 Dezimalzahl Runden"};
                Object selectionObject = showInputDialog(frame, "Aufgabe auswählen", "Prozedurales Programmieren Menü", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                String selectionString = selectionObject.toString();
                switch (selectionString) {
                    case "Aufgabe1 Quader":
                        aufgabe1_Quader();
                        break;
                    case "Aufgabe1 Quader Scanner":
                        aufgabe1_QuaderScanner();
                        break;
                    case "Aufgabe2 Quersumme Mit Modulo Operator Auf 4 Stellen":
                        aufgabe2_QuersummeMitModuloOperatorAuf4Stellen();
                        break;
                    case "Aufgabe3 Double Scanner":
                        aufgabe3_DoubleScanner();
                        break;
                    case "Aufgabe4 Dezimalzahl Runden":
                        aufgabe4_DezimalzahlRundenScanner();
                        break;
                }
            } catch (Exception e) {
                exit(-1);
            }
        }
    }

    //Code der in der 2. Vorlesung behandelt wurde
    public static void aufgabe1_Quader() {
        double seitenlaenge1 = Double.parseDouble(showInputDialog("Bitte geben Sie die erste Seitenlänge des Quaders ein:"));
        double seitenlaenge2 = Double.parseDouble(showInputDialog("Bitte geben Sie die zweite Seitenlänge des Quaders ein:"));
        double seitenlaenge3 = Double.parseDouble(showInputDialog("Bitte geben Sie die dritte Seitenlänge des Quaders ein:"));
        double volumen = seitenlaenge1 * seitenlaenge2 * seitenlaenge3;
        double oeberflaeche = 2 * seitenlaenge1 * seitenlaenge2 + 2 * seitenlaenge1 * seitenlaenge3 + 2 * seitenlaenge2 * seitenlaenge3;
        String ausgabeText = "Ein Quader mit der Länge " + seitenlaenge1 + " cm, der Breite " + seitenlaenge2 + " cm und der Höhe " + seitenlaenge3 + " cm besitzt eine Oberfläche von " + oeberflaeche + " cm² und ein Volumen von " + volumen + "cm³.";
        System.out.println(ausgabeText);
    }

    public static void aufgabe1_QuaderScanner() {
        Scanner meinScanner = new Scanner(System.in);
        meinScanner.useLocale(Locale.US);

        System.out.println("Bitte geben Sie die Länge der Seite ein:");
        double laenge = meinScanner.nextDouble();
        System.out.println("Bitte geben Sie die Breite der Seite ein:");
        double breite = meinScanner.nextDouble();
        System.out.println("Bitte geben Sie die Höhe der Seite ein:");
        double hoehe = meinScanner.nextDouble();
        double volumen = laenge * breite * hoehe;
        double oeberflaeche = 2 * laenge * breite + 2 * laenge * hoehe + 2 * breite * hoehe;

        String ausgabeText = "Ein Quader mit der Länge " + laenge + " cm, der Breite " + breite + " cm und der Höhe " + hoehe + " cm besitzt eine Oberfläche von " + oeberflaeche + " cm² und ein Volumen von " + volumen + "cm³.";
        System.out.println(ausgabeText);
        meinScanner.close();
    }

    public static void aufgabe2_QuersummeMitModuloOperatorAuf4Stellen() {
        Scanner meinScanner = new Scanner(System.in);
        meinScanner.useLocale(Locale.US);

        System.out.println("Vierstellige Zahl eingeben:");
        int zahl = meinScanner.nextInt();

        /*
        Der Modulo-Operator führt eine Restwert-Division zweier Elemente aus.
        Dieser Operator ist nur für Integer-Typen zulässig.
        Er entspricht der Berechnung des Restwertes einer Division.
        Beispiel1: 12 % 5 = 2, Rest: 2
        Beispiel2: 1 % 12 = 1, Rest: 1
         */

        int ersteZahl = (zahl / 1000) % 10;
        int zweiteZahl = (zahl / 100) % 10;
        int dritteZahl = (zahl / 10) % 10;
        int vierteZahl = zahl % 10;
        int quersumme = ersteZahl + zweiteZahl + dritteZahl + vierteZahl;
        String ausgabeText = "Die Quersumme von " + zahl + " ist: " + quersumme;
        System.out.println(ausgabeText);
        meinScanner.close();
    }

    public static void aufgabe3_DoubleScanner() {
        Scanner meinScanner = new Scanner(System.in);
        meinScanner.useLocale(Locale.US);

        System.out.println("Bitte geben Sie die erste Zahl ein:");
        double zahl1 = meinScanner.nextDouble();
        System.out.println("Bitte geben Sie die zweite Zahl ein:");
        double zahl2 = meinScanner.nextDouble();
        double produkt = zahl1 * zahl2;

        System.out.printf("%,.2f", produkt);
    }

    //3.1415926539 wurde als wert in bsp. aufgabe genommen
    public static void aufgabe4_DezimalzahlRundenScanner() {
        Scanner meinScanner = new Scanner(System.in);
        meinScanner.useLocale(Locale.US);

        System.out.println("Bitte geben Sie eine Dezimalzahl ein:");
        double dezimalZahl = meinScanner.nextDouble();

        System.out.println(dezimalZahl);
        System.out.printf("%(,10.3f%n", dezimalZahl);
        System.out.printf("%,11.0f%,11.2f%11.4e%n", dezimalZahl, dezimalZahl, dezimalZahl);
        System.out.printf("%020f", dezimalZahl);
    }
}
