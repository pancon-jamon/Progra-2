package Negocio;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class NumeroImaginario {
    private double numeroR;
    private double numeroI;
    
    public NumeroImaginario(){
        
    }
    public NumeroImaginario(double numeroR, double numeroI){
        this.numeroR = numeroR;
        this.numeroI = numeroI;
    }

    public double getNumeroR() {
        return numeroR;
    }

    public void setNumeroR(double numeroR) {
        this.numeroR = numeroR;
    }

    public double getNumeroI() {
        return numeroI;
    }

    public void setNumeroI(double numeroI) {
        String linea = JOptionPane.showInputDialog("Ingrese la parte real y parte imaginaria de un numero imaginario");
        StringTokenizer st = new StringTokenizer(linea);//tokenizar significa dividir un string en partes
        this.numeroR = Double.parseDouble(st.nextToken());
        this.numeroI = Double.parseDouble(st.nextToken());
    }

    @Override
    public String toString() {
        return "NumeroImaginario{" + "numeroE=" + numeroR + ", numeroI=" + numeroI + '}';
    }
    
    public void setNumImaginario(){
        try{
            
        }catch(NumberFormatException e){
            
        }
    }
}
