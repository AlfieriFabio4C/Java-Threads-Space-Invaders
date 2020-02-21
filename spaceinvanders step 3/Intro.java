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

/**
 *
 * @author alfieri.fabio
 */
public class Intro extends Space {

    private int i = 0;
    private BufferStrategy strategy;

    void run() throws InterruptedException {
        createBufferStrategy(2);
        strategy = getBufferStrategy();
        for (i = 100; i >= 0; i -= 1) {
            System.out.println("i: " + i);
            disegna();
            Thread.sleep(10);
        }
        for (i = 0; i < 10; i += 1) {
            System.out.println("i: " + i);
            disegna();
        }
    }

    void disegna() {
        Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
        g.setColor(Color.black);
        g.fillRect(0, 0, 800, 600);
        g.setColor(Color.red);
        g.setFont(new Font("Bold", Font.PLAIN, 40 + i));
        g.drawString("Space Invaders", 220 + i, 300 + i);
        g.setFont(new Font("Bold", Font.PLAIN, 10 + i));
        g.drawString("          by Fabio Alfieri", 500 + i + i, 500 + i + i);
        g.dispose();
        strategy.show();
    }
}
