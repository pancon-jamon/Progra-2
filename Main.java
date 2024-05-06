
package Fuentes;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author LabP3E009
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("j", 0, 0, 0, 0);
        float n1, n2, n3;
        // TODO code application logic here
        String linea = JOptionPane.showInputDialog(null, "Ingrese sus notas separadas por una coma", "Notas", 0);
        StringTokenizer st = new StringTokenizer(linea, ",");
        
        n1 = Float.parseFloat(st.nextToken());
        n2 = Float.parseFloat(st.nextToken());
        n3 = Float.parseFloat(st.nextToken());
        estudiante.setEstudiante("J", 0, n1, n2, n3);
        JOptionPane.showMessageDialog(null, estudiante.toString());
        JOptionPane.showMessageDialog(null, estudiante.aprueba());
        //System.out.println(estudiante.aprueba());
    }
    
}
