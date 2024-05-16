import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PasswordFieldActionListenerExample_exp7 extends JFrame {

    public PasswordFieldActionListenerExample_exp7() {
        setTitle("PasswordField with ActionListener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a password field
        JPasswordField passwordField = new JPasswordField(20);

        // Create a label to display the result
        JLabel resultLabel = new JLabel("Result:");

        // Create a panel and add components to it
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(passwordField, BorderLayout.NORTH);
        panel.add(resultLabel, BorderLayout.SOUTH);

        // Add an action listener to the password field to detect Enter key press
        passwordField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When Enter key is pressed, update the label with the entered password
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);
                resultLabel.setText("Result: " + password);
                
                // Clear the password field for security reasons
                passwordField.setText("");
            }
        });

        // Add the panel to the frame
        add(panel);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PasswordFieldActionListenerExample_exp7::new);
    }
}
