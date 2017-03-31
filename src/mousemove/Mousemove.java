/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mousemove;

import java.awt.MouseInfo;
import java.awt.*;

/**
 *
 * @author dennis
 */
public class Mousemove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        

            
        
            PointerInfo a = MouseInfo.getPointerInfo();
            Point b = a.getLocation();

            int xCoord = (int) b.getX();
            int yCoord = 680; //(int) b.getY();
            
            for (int i = 0; i < 3279; i++) {
                
                Thread.sleep(4000);
                System.out.println("Posição x: " + xCoord + " Posição y: " + yCoord);
                
                xCoord += 1;
                
                try {
                    
                    // Move the cursor
                    Robot robot = new Robot();
                    robot.mouseMove(xCoord, yCoord);
                    
                } catch (AWTException e) {
                }
            
            }
            
            

            
            
        
    }
    
}
