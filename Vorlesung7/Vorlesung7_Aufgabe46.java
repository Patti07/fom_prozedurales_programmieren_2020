import static javax.swing.JOptionPane.*;

public class Vorlesung7_Aufgabe46 {

    public static void main(String[] args) {
        double zahl1 = Double.parseDouble(showInputDialog("Bitte geben Sie die erste Zahl ein: "));
        double zahl2 = Double.parseDouble(showInputDialog("Bitte geben Sie die zweite Zahl ein: "));
        String operationInput = showInputDialog("Bitte geben Sie die gewünschte Operation ein: ");
        String[] allowedOperations = {"+", "-", "*", "/"};
        boolean operationAllowed = false;
        for(int i = 0; i < allowedOperations.length; i++) {
            if(allowedOperations[i].equals(operationInput)) {
                operationAllowed = true;
            }
        }
        if(operationAllowed) {
            if(zahl2 == 0 && operationInput.equals("/")) {
                showMessageDialog(null, "Durch 0 lässt sich nicht teilen!", "Error Dialog", ERROR_MESSAGE);
            } else {
                char operation = operationInput.charAt(0);
                int result = operationsWith2Numbers(zahl1, zahl2, operation);
                showMessageDialog(null, "Das Ergebnis lautet: " + result, "Info Dialog", INFORMATION_MESSAGE);
            }
        } else {
            showMessageDialog(null, "Du hast eine falschen Operator angegeben!", "Error Dialog", ERROR_MESSAGE);
        }
    }

    public static int operationsWith2Numbers(double zahl1, double zahl2, char operation) {
        double ergebnis = 0;
        switch (operation) {
            case '+':
                ergebnis = zahl1 + zahl2;
                break;
            case '-':
                ergebnis = zahl1 - zahl2;
                break;
            case '*':
                ergebnis = zahl1 * zahl2;
                break;
            case '/':
                ergebnis = zahl1 / zahl2;
                break;
        }
        return (int) ergebnis;
    }
}
