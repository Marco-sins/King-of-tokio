import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Cargar_elementos_layout extends JFrame
{
    public void crear_elementos()
    {
        JFrame ventana = new JFrame("King of Tokio");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        ventana.setSize(screenSize);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color fondColor = new Color(255, 255, 255);
        ventana.getContentPane().setBackground(fondColor);

        ImageIcon logoIcon = new ImageIcon("sources/logo.jpg");
        JLabel logo = new JLabel(logoIcon);
        logo.setBounds(640, 0, 640, 150);
        ventana.add(logo);

        ventana.setVisible(true);
    }   
}
