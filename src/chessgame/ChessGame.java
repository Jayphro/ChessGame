/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessgame;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author jabal3175
 */
public class ChessGame extends JFrame {

    public ChessGame() {
        initUI();
    }

    public void initUI() {

        add(new MenuScreen());
        setSize(500, 500);
        setTitle("Chess Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().add(new getImage(""));

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ChessGame ex = new ChessGame();
                ex.setVisible(true);
            }
        });

    }

}
