package layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class Login_layout extends JFrame
{
    public Login_layout()
    {
        JPanel panel = new JPanel();
        
        // login
        JButton login = new JButton();
        login.setBounds(200, 100, 100, 50);
        this.add(login);


        // Registrar
        JButton registrar = new JButton();
        registrar.setBounds(500, 100, 100, 50);
        this.add(registrar);

        this.setVisible(true);
    }
}
