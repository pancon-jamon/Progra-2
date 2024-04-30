package Negocio;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        NumeroComplejo numeroComplejoUno = new NumeroComplejo();//constructor vacio(no por defecto) inmediatamente cuando se define uno el por default ya no existe
        numeroComplejoUno.setNumeroC();//En este punto ESTE es el objeto actual
        
        NumeroComplejo numeroComplejoDos = new NumeroComplejo();//segundo objeto obtenido de la misma clase
        numeroComplejoDos.setNumeroC();//Ahora ESTE es el objeto actual
        
        NumeroComplejo numCompTres;//no necesita ser instanciado porque no va a necesitar los atributos por, ahora solo es un puntero, no un objeto
        numCompTres = numeroComplejoUno.sumaNumComplejos(numeroComplejoDos);
        
        NumeroComplejo numCompRest;//no necesita ser instanciado porque no va a necesitar los atributos por, ahora solo es un puntero, no un objeto
        numCompRest = numeroComplejoUno.restaNumComplejos(numeroComplejoDos);
        
        //String numero = JOptionPane.showInputDialog("Digite 1 si desea ingresar el numero complejo uno o 2 el numero complejo dos"); 
        int opcion = 0;
        do{
            JOptionPane.showMessageDialog(null, numeroComplejoUno + "\n" + numeroComplejoDos, "Numeros complejos", 1);//el numero al final me permite desplegar diferentes mensajes predeterminados
            JOptionPane.showMessageDialog(null,numCompTres, "Suma complejos" , 1);//el numero al final me permite desplegar diferentes mensajes predeterminados
            JOptionPane.showMessageDialog(null,numCompRest, "Resta complejos" , 1);
            opcion = JOptionPane.showConfirmDialog(null, "Continuar?");
        }while(opcion == JOptionPane.YES_NO_OPTION);
        

    }
    
}
