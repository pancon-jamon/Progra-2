package Negocio;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class NumeroComplejo {
    private double numeroR, numeroC;
    
    public NumeroComplejo(){
        
    }
    public NumeroComplejo(double numeroR, double numeroI){
        this.numeroR = numeroR;
        this.numeroC = numeroI;
    }

    public double getNumeroR() {
        return numeroR;
    }

    public void setNumeroR(double numeroR) {
        this.numeroR = numeroR;
    }

    public double getNumeroC() {
        return numeroC;
    }

    public void setNumeroC() {
        try{
            String linea = JOptionPane.showInputDialog("Digite la parte real y parte imaginaria de un numero complejo, separada por una coma");
            StringTokenizer st = new StringTokenizer(linea, ",");//tokenizar significa dividir un string en partes, 
            
            this.numeroR = Double.parseDouble(st.nextToken());
            this.numeroC = Double.parseDouble(st.nextToken());
        }catch(NumberFormatException e){//Exception toma cualquier error, para este es especifico de numeros
            System.out.println("Ingrese numeros");
            setNumeroC();
        }

    }
   public NumeroComplejo sumaNumComplejos(NumeroComplejo numComp2){
        NumeroComplejo numCompDos = new NumeroComplejo();
        numCompDos.numeroR = this.numeroR + numComp2.numeroR;
        numCompDos.numeroC = this.numeroC + numComp2.numeroC;
        return numCompDos;
    }
   
   public NumeroComplejo restaNumComplejos(NumeroComplejo numComp2){
        NumeroComplejo numCompDos = new NumeroComplejo();
        numCompDos.numeroR = this.numeroR - numComp2.numeroR;
        numCompDos.numeroC = this.numeroC - numComp2.numeroC;
        return numCompDos;
    }

    @Override
    public String toString() {
        return "Parte compleja: "+ numeroC + " i \n" + "Parte real: " + numeroR;
    }
    
}
