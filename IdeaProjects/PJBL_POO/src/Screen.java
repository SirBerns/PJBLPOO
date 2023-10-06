import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame implements ActionListener {
    public Screen(){
        setTitle("Gerenciador Java - Projeto");
        setVisible(true);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        setLayout(null);
        JButton button1 = new JButton("Clique Aqui!");
        button1.setBounds(100, 200, 100, 30);
        add(button1);

        button1.addActionListener(this::buttonAction);
    }

    public void buttonAction(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "Outro metodo com erro!", "Aviso!",
                JOptionPane.WARNING_MESSAGE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
