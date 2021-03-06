/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author alfieri.fabio
 */
public class SpaceInvaders extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        new SpaceInvaders();
    }
    private Space space = new Space();
    public SpaceInvaders() throws InterruptedException {
        super("Space Invaders 101"); 
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        setIgnoreRepaint(true);
        Intro intro = new Intro();
        this.add(intro);
        this.pack();
        this.setVisible(true);
        intro.run();

    }

}
