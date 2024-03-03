// Develop a Java program to demonstrate the java swings


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingExample {

   
    public static void main(String[] args) {
        // Creating the Frame
        JFrame frame = new JFrame("Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
       
        // Creating the Button
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Display the dialog message when the button is clicked
                JOptionPane.showMessageDialog(frame, "Hello, Swing!");
            }
        });
       
        // Adding Button to the frame
        frame.getContentPane().add(button);
       
        // Setting the frame visibility to true
        frame.setVisible(true);

    }
}

