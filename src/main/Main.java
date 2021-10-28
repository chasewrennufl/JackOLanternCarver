package main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Jack-O-Lantern Carver");
        JPanel imagePanel = (JPanel) frame.getContentPane();
        JImageComponent imageComponent = new JImageComponent();
        Image image = ImageIO.read(new File("src/main/Assets/PumpkinBackground.jpeg"));
        Icon icon = new ImageIcon(image);
        imageComponent.setIcon(icon);
        imagePanel.add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
