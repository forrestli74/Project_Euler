
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jiaqi
 */
public class a408 {
    public static void main(String[] args){
        final int size=100;
        JPanel j=new JPanel(){
            @Override
            public void paint(Graphics g){
                Graphics2D g2=(Graphics2D) g;
                
                g2.scale(getWidth()*1./size, getHeight()*1./size);
                for(int t1=0;t1<size;t1++){
                    for(int t2=0;t2<size;t2++){
                        if(t1>0&&t2>0&&a000.sqrtif(t1)&&a000.sqrtif(t2)&&a000.sqrtif(t1+t2)){
                            g2.setColor(Color.RED);
                        }else{
                            g2.setColor(Color.GREEN);
                        }
                        g2.fillRect(t1,t2,1,1);
                    }
                }
                
            }
        };
        JFrame f=new JFrame();
        f.add(j);
        f.setVisible(true);
    }
}
