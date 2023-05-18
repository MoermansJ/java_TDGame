package main;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class GameScreen extends JPanel {
    //properties
    private Random random;
    private BufferedImage bufferedImage;
    private ArrayList<BufferedImage> sprites;


    //constructors
    public GameScreen(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
        sprites = new ArrayList<>();
        random = new Random();

        loadSprites();
    }


    //custom methods
    private void loadSprites() {
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                sprites.add(bufferedImage.getSubimage(x * 32, y * 32, 32, 32));
            }
        }
    }

    @Override //NOTE: this annotation wasn't included in the tutorial -> maybe send the guy in the video a message?
    //TIMESTAMP: 12m45s https://www.youtube.com/watch?v=kclnyiXmY7Q&list=PL4rzdwizLaxb0-TajNIp5DOoT_PAxhx0T&index=2
    public void paintComponent(Graphics g) {
        super.paintComponent(g);


        g.drawImage(sprites.get(19), 0, 0, null);

    }

}
