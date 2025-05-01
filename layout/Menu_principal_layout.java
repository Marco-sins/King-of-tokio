package layout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public abstract class Menu_principal_layout extends JFrame
{
    private ImageIcon imagen;

    public Menu_principal_layout()
    {
        this.setSize(getDimension());
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(255, 255, 255));
        cargar_imagen();
        JLabel logo = new JLabel(imagen);
    }  

    private void cargar_imagen()
    {
        imagen = new ImageIcon("images/logo.jpg");
    }
    
    private Dimension getDimension()
    {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        return dimension;
    }
}
