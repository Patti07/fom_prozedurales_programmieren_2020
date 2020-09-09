import static javax.swing.JOptionPane.*;

public class ProzeduralesProgrammierenUebungsaufgabenSimple {
    public static void main(String[] args) {
        System.out.println("==========================================================================\n");
        System.out.println("Aufgabe1\n");
        System.out.println("Patrick P");
        System.out.println();
        System.out.println("Ich bin froh, dass ich an der FOM studieren darf.");
        System.out.println("==========================================================================\n");

        System.out.println("Aufgabe2\n");
        System.out.print("\"Patrick P\"\n\n\"Ich bin froh, dass ich an der FOM studieren darf.\"\n");
        System.out.println("==========================================================================\n");

        System.out.println("Aufgabe3\n");
        System.out.println("Dialogfeld wird angezeigt.");
        showMessageDialog(null, "Patrick P\n\nIch bin froh, dass ich an der FOM studieren darf.", "Wichtige Nachricht!", INFORMATION_MESSAGE);
        System.out.println("==========================================================================\n");

        System.out.println("Aufgabe4\n");
        String eingabe = showInputDialog("Bitte geben Sie eine Zahl ein:");
        System.out.println(eingabe);
        System.out.println("==========================================================================\n");

        System.out.println("Aufgabe5 Formatierte Ausgabe PI\n");
        final double PI = 3.141592653589793;
        System.out.printf("%s%.3f%n", "Auf die dritte Stelle gerundete Kreiszahl PI: ", PI);
        System.out.printf("%s%.8f%n", "Auf die achte Stelle gerundete Kreiszahl PI: ", PI);
        System.out.printf("%s%e%n", "Kreiszahl PI mit 1 Million multipliziert als Exponential Zahl: ", PI * 1000000);
        System.out.printf("%s%10.0f%n", "Ohne Nachkommastellen mit der Ausgabebreite von 10: ", PI);
        System.out.println("==========================================================================\n");

        System.out.println("Aufgabe6\n");
        double eingabe2 = Double.parseDouble(showInputDialog("Bitte geben Sie eine Zahl ein:"));
        double ausgabe = eingabe2 * 2;
        String ausgabeText = eingabe + " * 2 = " + ausgabe;
        System.out.println(ausgabeText);
        System.out.println("==========================================================================\n");

        System.out.println("Aufgabe7 Mit Printf Methode\n");
        final double PI2 = 3.141592653589793;
        double radius = Double.parseDouble(showInputDialog("Bitte geben Sie eine Zahl ein:"));
        double umfang = (2 * PI2 * radius);
        double flaeche = (PI2 * (radius * radius));
        System.out.printf("%s%.2f%s%.2f%s%.2f%s%n", "Bei einem Radius von ", radius, " beträgt der Umfang ", umfang, ". Die Fläche ist ", flaeche, ".");
        System.out.println("==========================================================================\n");

        System.out.println("Aufgabe7 mit Math Klasse\n");
        double radius2 = Double.parseDouble(showInputDialog("Bitte geben Sie eine Zahl ein:"));
        double umfang2 = Math.round(2 * Math.PI * radius2 * 100.0) / 100.0;
        double flaeche2 = Math.round(Math.PI * Math.pow(radius2, 2) * 100.0) / 100.0;
        String ausgabeText2 = "Bei einem Radius von " + String.format("%.2f", radius2) + " beträgt der Umfang " + String.format("%.2f", umfang2) + ". Die Fläche ist " + String.format("%.2f", flaeche2) + ".";
        System.out.println(ausgabeText2);
        System.out.println("==========================================================================\n");
    }
}
