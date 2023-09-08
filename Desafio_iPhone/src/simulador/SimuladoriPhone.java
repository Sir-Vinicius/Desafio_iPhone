package simulador;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import iPhone.iPhone;

public class SimuladoriPhone {
    private iPhone iphone = new iPhone();

    public SimuladoriPhone() {
        JFrame frame = new JFrame("Simulador iPhone");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JButton playButton = new JButton("Tocar Música");
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iphone.tocar();
            }
        });

        JButton callButton = new JButton("Ligar para Alguém");
        callButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iphone.ligar();
            }
        });

        JButton browseButton = new JButton("Navegar na Internet");
        browseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iphone.exibirPagina();
            }
        });

        JButton exitButton = new JButton("Sair");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panel.add(playButton);
        panel.add(callButton);
        panel.add(browseButton);
        panel.add(exitButton);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SimuladoriPhone();
            }
        });
    }
}

