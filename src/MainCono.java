import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class MainCono {
public static ArrayList<Cono> conos = new ArrayList <Cono>();

    public static void main(String[] args) {

        crearConos();
        imprimirVolumen();

    }

    /**
     * Metodo para crear los conos y añadir al arraylist
     */
    public static void crearConos() {
        int cantidad = 4;
        for (int i = 0; i < cantidad; i++) {
            double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura del cono "+(i+1)));
            double base = Double.parseDouble(JOptionPane.showInputDialog
                    (null, "Ingrese la medida de la base del cono " + (i + 1)));

            Cono miCubo= new Cono((float) base,(float) altura);
            conos.add(miCubo);
        }
    }

    /**
     * Método para imprimir el volúmen de los conos
     * @param
     */
    public static void imprimirVolumen() {
        for (Cono c : conos) {
            JOptionPane.showMessageDialog(null,
                    "El volúmen es de " + c.calculoVolumen());
        }
    }


}
