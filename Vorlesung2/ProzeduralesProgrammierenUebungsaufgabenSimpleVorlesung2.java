import java.util.*;
import static javax.swing.JOptionPane.showInputDialog;

public class ProzeduralesProgrammierenUebungsaufgabenSimpleVorlesung2 {
    public static void main(String[] args) {
        System.out.println("Aufgabe1 Quader\n");
        double seitenlaenge1 = Double.parseDouble(showInputDialog("Bitte geben Sie die erste Seitenlänge des Quaders ein:"));
        double seitenlaenge2 = Double.parseDouble(showInputDialog("Bitte geben Sie die zweite Seitenlänge des Quaders ein:"));
        double seitenlaenge3 = Double.parseDouble(showInputDialog("Bitte geben Sie die dritte Seitenlänge des Quaders ein:"));
        double volumen = seitenlaenge1 * seitenlaenge2 * seitenlaenge3;
        double oeberflaeche = 2 * seitenlaenge1 * seitenlaenge2 + 2 * seitenlaenge1 * seitenlaenge3 + 2 * seitenlaenge2 * seitenlaenge3;
        String ausgabeText = "Ein Quader mit der Länge " + seitenlaenge1 + " cm, der Breite " + seitenlaenge2 + " cm und der Höhe " + seitenlaenge3 + " cm besitzt eine Oberfläche von " + oeberflaeche + " cm² und ein Volumen von " + volumen + "cm³.";
        System.out.println(ausgabeText);
        System.out.println("\n=================================================================================================================\n");

        System.out.println("\n=================================================================================================================");
        System.out.println("Aufgabe1 Quader Scanner\n");
        Scanner meinScanner = new Scanner(System.in);
        meinScanner.useLocale(Locale.US);

        System.out.println("Bitte geben Sie die Länge der Seite ein:");
        double laenge = meinScanner.nextDouble();
        System.out.println("Bitte geben Sie die Breite der Seite ein:");
        double breite = meinScanner.nextDouble();
        System.out.println("Bitte geben Sie die Höhe der Seite ein:");
        double hoehe = meinScanner.nextDouble();
        double volumen2 = laenge * breite * hoehe;
        double oeberflaeche2 = 2 * laenge * breite + 2 * laenge * hoehe + 2 * breite * hoehe;

        String ausgabeText2 = "Ein Quader mit der Länge " + laenge + " cm, der Breite " + breite + " cm und der Höhe " + hoehe + " cm besitzt eine Oberfläche von " + oeberflaeche2 + " cm² und ein Volumen von " + volumen2 + "cm³.";
        System.out.println(ausgabeText2);
        System.out.println("\n=================================================================================================================\n");

        System.out.println("\n=================================================================================================================");
        System.out.println("Aufgabe2 Quersumme Mit Modulo berechnen auf 4 Stellen");
        Scanner meinScanner2 = new Scanner(System.in);
        meinScanner2.useLocale(Locale.US);

        System.out.println("Vierstellige Zahl eingeben:");
        int zahl = meinScanner2.nextInt();

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
        String ausgabeText3 = "Die Quersumme von " + zahl + " ist: " + quersumme;
        System.out.println(ausgabeText3);
        System.out.println("\n=================================================================================================================\n");

        System.out.println("\n=================================================================================================================");
        System.out.println("Aufgabe3 Double Scanner");
        Scanner meinScanner3 = new Scanner(System.in);
        meinScanner3.useLocale(Locale.US);

        System.out.println("Bitte geben Sie die erste Zahl ein:");
        double zahl1 = meinScanner3.nextDouble();
        System.out.println("Bitte geben Sie die zweite Zahl ein:");
        double zahl2 = meinScanner3.nextDouble();
        double produkt = zahl1 * zahl2;

        System.out.printf("%,.2f", produkt);
        System.out.println("\n=================================================================================================================\n");

        //3.1415926539 wurde als wert in bsp. aufgabe genommen
        System.out.println("\n=================================================================================================================");
        System.out.println("Aufgabe4 Dezimalzahl Runden Scanner");
        Scanner meinScanner4 = new Scanner(System.in);
        meinScanner4.useLocale(Locale.US);

        System.out.println("Bitte geben Sie eine Dezimalzahl ein:");
        double dezimalZahl = meinScanner4.nextDouble();

        System.out.println(dezimalZahl);
        System.out.printf("%(,10.3f%n", dezimalZahl);
        System.out.printf("%,11.0f%,11.2f%11.4e%n", dezimalZahl, dezimalZahl, dezimalZahl);
        System.out.printf("%020f", dezimalZahl);
        System.out.println("\n=================================================================================================================");
    }
}
