import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeiroFrame {
    private JPanel PrimeiroFrame;
    private JButton CliqueTexto;

    public PrimeiroFrame() {
        CliqueTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Vai tomar no cu");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PrimeiroApp");
        frame.setContentPane(new PrimeiroFrame().PrimeiroFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
