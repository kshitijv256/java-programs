import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class newGUI implements ActionListener {

    int count = 0;
    JLabel label = new JLabel("No cLicks yet");

    public newGUI(){
        JFrame frame = new JFrame("My First GUI");
         
        JButton button = new JButton("Press here");
        
        button.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));

        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new newGUI();
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
        
    }
}
