import static javax.swing.JOptionPane.showInputDialog;

public class Vorlesung7_Aufgabe45 {

    public static void main(String[] args) {
        double zahl1 = Double.parseDouble(showInputDialog("Bitte geben Sie die erste Zahl ein: "));
        double zahl2 = Double.parseDouble(showInputDialog("Bitte geben Sie die zweite Zahl ein: "));
        int result = division(zahl1, zahl2);

        System.out.println("Das Ergebnis lautet: " + result);
    }

    public static int division(double zahl1, double zahl2) {
        double ergebnis = zahl1/zahl2;
        return (int) ergebnis;
    }
}
