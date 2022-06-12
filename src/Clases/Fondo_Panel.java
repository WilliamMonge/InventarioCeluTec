package Clases;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;
 

public class Fondo_Panel implements Border{
    public BufferedImage imagen;
 
    public Fondo_Panel(){
        try {
            URL imagePath = new URL(getClass().getResource("/Imagenes/Imagen 122.jpg").toString());
            imagen = ImageIO.read(imagePath);
        } catch (Exception ex) {            
        }
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        int x0= x + (width - imagen.getWidth())/2;
        int y0=y + (height - imagen.getHeight())/2;
        g.drawImage(imagen,x0,y0, null);
    }
 
    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }
 
    public boolean isBorderOpaque() {
        return false;
    }
 
}
