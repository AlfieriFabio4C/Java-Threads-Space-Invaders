/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author alfieri.fabio
 */
public class Intro extends Space {

    private int i = 0;
    private BufferStrategy strategy;

    void run() throws InterruptedException {
    
}

    void disegna() {
        Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
        g.setColor(Color.red);
        g.setFont(new Font("Bold", Font.PLAIN, 40 + i));
        g.drawString("Space Invaders", 220 + i, 300 + i);
        g.setFont(new Font("Bold", Font.PLAIN, 10 + i));
        g.drawString("          by Fabio Alfieri", 500 + i + i, 500 + i + i);
        g.dispose();
        strategy.show();
    }
}
