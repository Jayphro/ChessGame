/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chessgame;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
/**
 *
 * @author jabal3175
 */
public class MenuScreen extends JPanel{
     
    private Image bgImage;
    
    //Creating Rectangles which act as a operation buttons.
    public Rectangle playButton        = new Rectangle(ChessGame.WIDTH / 2, 50 , 100, 50);
    public Rectangle helpButton        = new Rectangle(ChessGame.WIDTH / 2, 150, 100, 50);
    public Rectangle gameStatsButton   = new Rectangle(ChessGame.WIDTH / 2, 250, 200, 50);
    public Rectangle exitButton        = new Rectangle(ChessGame.WIDTH / 2, 350, 200, 50);
    
    
    
    public void getImage(String fileName) throws IOException
    {
        bgImage = ImageIO.read(new File(fileName));
        
    }
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        // Draw the background image.
        g.drawImage(bgImage, 0, 0, this);
        menu(g);
    }
  
    public void menu(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        
         
        
        Font fontOne = new Font ("ariel", Font.BOLD, 40 );
        g.setFont(fontOne);
        g.setColor(Color.black);
        g.drawString("CHESS GAME", ChessGame.WIDTH / 2 , 30);
        
        
        Font fontTwo = new Font("ariel", Font.BOLD, 30);
        g.setFont(fontTwo);
        
        g2d.draw(playButton);
        g.drawString("Play", playButton.x + 20, playButton.y + 40);
        g2d.draw(helpButton);
        g.drawString("Help", helpButton.x + 20, helpButton.y + 40);
        g2d.draw(gameStatsButton);
        g.drawString("Statistics", gameStatsButton.x + 20, gameStatsButton.y + 40);
        g2d.draw(exitButton);
        g.drawString("Exit", exitButton.x + 20, exitButton.y + 40);
        
        
        
    }
    
    
    
}
