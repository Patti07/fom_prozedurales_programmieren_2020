import javax.sound.midi.SysexMessage;
import javax.swing.*;
import java.util.*;

import static java.lang.System.exit;
import static javax.swing.JOptionPane.*;

public class ProzeduralesProgrammierenUebungsaufgabenMenuVorlesung1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        // Endlos Schleife, weil wir ja nicht wollen, dass sich das Programm nach der selection beendet.
        while (true) {
            try {
                Object[] options = {"Aufgabe1", "Aufgabe2", "Aufgabe3", "Aufgabe4", "Aufgabe5 Formatierte Ausgabe PI", "Aufgabe6 Parse String", "Aufgabe7 Mit Printf", "Aufgabe7 Mit Math Klasse"};
                Object selectionObject = showInputDialog(frame, "Aufgabe auswählen", "Prozedurales Programmieren Menü", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                String selectionString = selectionObject.toString();
                switch (selectionString) {
                    case "Aufgabe1":
                        aufgabe1();
                        break;
                    case "Aufgabe2":
                        aufgabe2();
                        break;
                    case "Aufgabe3":
                        aufgabe3();
                        break;
                    case "Aufgabe4":
                        aufgabe4();
                        break;
                    case "Aufgabe5 Formatierte Ausgabe PI":
                        aufgabe5FormatierteAusgabePI();
                        break;
                    case "Aufgabe6 Parse String":
                        aufgabe6ParseString();
                        break;
                    case "Aufgabe7 Mit Printf":
                        aufgabe7KreisMitPrintf();
                        break;
                    case "Aufgabe7 Mit Math Klasse":
                        aufgabe7KreisMitMathClass();
                        break;
                }
            } catch (Exception e) {
                exit(-1);
            }
        }
    }

    //Code der in der 1. Vorlesung behandelt wurde
    public static void aufgabe1() {
        System.out.println("Aufgabe1");
        System.out.println("Patrick Peuckmann");
        System.out.println("");
        System.out.println("Ich bin froh, dass ich an der FOM studieren darf.");
    }

    public static void aufgabe2() {
        System.out.println("Aufgabe2");
        System.out.print("\"Patrick Peuckmann\"\n\n\"Ich bin froh, dass ich an der FOM studieren darf.\"");
    }

    public static void aufgabe3() {
        System.out.println("Aufgabe3");
        System.out.println("Dialogfeld wird angezeigt.");
        showMessageDialog(null, "Patrick Peuckmann\n\nIch bin froh, dass ich an der FOM studieren darf.", "Wichtige Nachricht!", INFORMATION_MESSAGE);
    }

    public static void aufgabe4() {
        System.out.println("Aufgabe4");
        String eingabe = showInputDialog("Bitte geben Sie eine Zahl ein:");
        System.out.println(eingabe);
    }

    public static void aufgabe5FormatierteAusgabePI() {
        System.out.println("Aufgabe5 Formatierte Ausgabe PI");
        final double PI = 3.141592653589793;
        System.out.printf("%s%.3f%n", "Auf die dritte Stelle gerundete Kreiszahl PI: ", PI);
        System.out.printf("%s%.8f%n", "Auf die achte Stelle gerundete Kreiszahl PI: ", PI);
        System.out.printf("%s%e%n", "Kreiszahl PI mit 1 Million multipliziert als Exponential Zahl: ", PI * 1000000);
        System.out.printf("%s%10.0f%n", "Ohne Nachkommastellen mit der Ausgabebreite von 10: ", PI);
    }

    public static void aufgabe6ParseString() {
        System.out.println("Aufgabe6");
        double eingabe = Double.parseDouble(showInputDialog("Bitte geben Sie eine Zahl ein:"));
        double ausgabe = eingabe * 2;
        String ausgabeText = eingabe + " * 2 = " + ausgabe;
        System.out.println(ausgabeText);
    }

    public static void aufgabe7KreisMitPrintf() {
        System.out.println("Aufgabe7 Mit Printf Methode");
        final double PI = 3.141592653589793;
        double radius = Double.parseDouble(showInputDialog("Bitte geben Sie eine Zahl ein:"));
        double umfang = (2 * PI * radius);
        double flaeche = (PI * (radius * radius));

        System.out.printf("%s%.2f%s%.2f%s%.2f%s%n", "Bei einem Radius von ", radius, " beträgt der Umfang ", umfang, ". Die Fläche ist ", flaeche, ".");
    }

    public static void aufgabe7KreisMitMathClass() {
        System.out.println("Aufgabe7 mit Math Klasse");
        double radius = Double.parseDouble(showInputDialog("Bitte geben Sie eine Zahl ein:"));
        double umfang = Math.round(2 * Math.PI * radius * 100.0) / 100.0;
        double flaeche = Math.round(Math.PI * Math.pow(radius, 2) * 100.0) / 100.0;
        String ausgabeText = "Bei einem Radius von " + String.format("%.2f", radius) + " beträgt der Umfang " + String.format("%.2f", umfang) + ". Die Fläche ist " + String.format("%.2f", flaeche) + ".";
        System.out.println(ausgabeText);
    }
}
