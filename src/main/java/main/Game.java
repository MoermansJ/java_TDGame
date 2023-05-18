package main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class Game extends JFrame {
    //properties
    private GameScreen gameScreen;
    private BufferedImage bufferedImage;


    //constructor
    public Game() {
        //spriteatlas.png logic
        importImage();

        //JFrame logic
        setSize(640, 640); //values in px
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); //starts GUI window in centre of screen
        gameScreen = new GameScreen(bufferedImage);
        add(gameScreen);
        setVisible(true); //by default setVisible = false; NOTE: make sure this is the last instruction
    }


    //custom methods
    private void importImage() {
        InputStream inputStream = getClass().getResourceAsStream("/spriteatlas.png");

        try {
            bufferedImage = ImageIO.read(inputStream);
        } catch (IOException e) {
            System.out.println("importImage() - Something went wrong");
            e.printStackTrace();
        }
    }


    //main method
    public static void main(String[] args) {
        Game game = new Game();
    }
}
