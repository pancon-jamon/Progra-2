/**
 * @name Claudia Coello
 * @date 26/04/2023
 * @description Esta es una clase para inicializar el estudio de POO(programacion orientada a objetos).
 * */

public class Fecha
{
	public static void main(String[] args) {
	    Fecha dia = new Fecha(); //Nombre de la clase + Variable de referencia = new(crea el espacio de memoria) + Nombre de la Clase + (constructor, en este caso predeterminado) -> Esto es la instanciacion de objetos.
	    
	    /**
	     * Lenguaje unificado de modelamiento (UMl) de la clase
	     *          Perro          ¬Nombre de la clase
	     *     Nombre          -
	     *     Raza            - Atributos
	     *     Edad            -
	     *     Comer()
	     *     Dormir()        Metodos
	     *     Ladrar()
	     * */
	     
	     /**
	      * Los construtores me permiten inicializar atributos
	      * */
	      
	     private int x; // variable de tipo int que solo puede ser usada en esta clase
	     
	     //Ejemplo de construtor por defecto(no es necesario escribirlo)
	     public Fecha(){ //public(un construtor siempre es publico) + Nombre de la clase + () [este es por defecto, no lleva nada en los parentesis]
	         this.x = 0; //Asignamos 0 al atributo x del objeto correspondiente es decir a la x de arriba
	     }
	    
	    //Ejemplo de construtor con parametro (sobrecargado) inicializa los atributos con los datos que deseamos
	     public Fecha(int x){ //public(un construtor siempre es publico) + Nombre de la clase + () [este es por defecto, no lleva nada en los parentesis]
	         this.x = x; //A la x de arriba le asignamos el valor que tiene el parametro x de este construtor
	     }
	}
}
