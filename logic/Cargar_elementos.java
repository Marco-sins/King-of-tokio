package logic;

import javax.swing.Timer;

import layout.Cargar_elementos_layout;

public class Cargar_elementos extends Cargar_elementos_layout
{
    public Cargar_elementos()
    {
        super();
    }

    public void cerrar_pantalla()
    {
        setVisible(true);

        Timer timer = new Timer(5000, e -> {
            Login login = new Login();
            this.dispose();
        });
        timer.setRepeats(false);
        timer.start();
    }
}
