import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Carta {

    private int indice;

    public Carta(Random r) {
        this.indice = r.nextInt(52) + 1;
    }

    public int getIndice() {
        return this.indice;
    }

    public void mostrar(int x, int y, JPanel pnl) {
        JLabel lbl = new JLabel();
        String nombreArchivo = "imagenes/carta" + this.indice + ".jpg";
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreArchivo));
        lbl.setIcon(imagen);
        lbl.setBounds(x, y, imagen.getIconWidth(), imagen.getIconHeight());
        pnl.add(lbl);
    }

}
