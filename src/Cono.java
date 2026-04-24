import javax.swing.*;
import java.util.Scanner;

/**
 * Clase Cono
 */
public class Cono  {

    private float base;
    private float altura;

    public Cono (float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Metodo para calcular el volumen del cono
     * @return
     */
    public float calculoVolumen() {
        float radio = Float.parseFloat(JOptionPane.showInputDialog(null,
                "Ingrese el radio del cono"));
        float vol = (float) ((3.14) * (Math.pow(radio, 2)) * getAltura() / 3);
        return vol;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cono{" +
                "altura=" + altura +
                ", base=" + base +
                '}';
    }
}


