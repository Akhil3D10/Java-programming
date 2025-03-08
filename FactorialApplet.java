import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialApplet extends Applet {
    private TextField inputField;
    private TextField outputField;

    @Override
    public void init() {
        // Create and initialize input text field
        inputField = new TextField(10);
        add(new Label("Enter an integer:"));
        add(inputField);

        // Create and initialize output text field
        outputField = new TextField(10);
        outputField.setEditable(false);
        add(new Label("Factorial value:"));
        add(outputField);

        // Create and initialize the compute button
        Button computeButton = new Button("Compute");
        add(computeButton);

        // Register ActionListener for the compute button
        computeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the entered number from the input field
                int number = Integer.parseInt(inputField.getText());

                // Calculate the factorial
                long factorial = calculateFactorial(number);

                // Display the factorial in the output field
                outputField.setText(String.valueOf(factorial));
            }
        });
    }

    private long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
