/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Estudiantes
 */
public class CuerpoElfo implements Cuerpo{
    Image imagen;
    
    public CuerpoElfo(){
        imagen = new ImageIcon(getClass().getResource(
                "/Imagenes.personajes/Elfo.jpg")).getImage();
    }
    @Override
    public void draw(Graphics g){
        g.drawImage(imagen, 0, 0, null);
    }
    public String descripcion(){
        return "";
    }
    
}
