package layout;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;

public abstract class Cargar_elementos_layout extends JFrame
{
    private ImageIcon imagen;
    public Cargar_elementos_layout()
    {
        this.setSize(getDimension());
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(255, 255, 255));
        cargar_imagen();
        JLabel logo = new JLabel(imagen);
        logo.setBounds(new Rectangle(getDimension().width / 2, getDimension().height / 2));
        this.add(logo);
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
