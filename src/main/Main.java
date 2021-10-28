package main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Jack-O-Lantern Carver");
        frame.setPreferredSize(new Dimension(600, 600));
        JPanel imagePanel = (JPanel) frame.getContentPane();
        JImageComponent imageComponent = new JImageComponent();
        Image image = ImageIO.read(new File("src/main/Assets/PumpkinBackground.jpeg"));
        Icon icon = new ImageIcon(image);
        imageComponent.setIcon(icon);
        imageComponent.setSizeMode(JImageComponent.SizeMode.STRETCH);
        imagePanel.add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        };
    }
}
