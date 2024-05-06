
package Fuentes;

/**
 *
 * @author LabP3E009
 */
public class Estudiante {
    private String nombre;
    private long cedula;
    private float n1, n2, n3;

    public Estudiante(String nombre, long cedula, float n1, float n2, float n3) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    public void setEstudiante(String nombre, long cedula, float n1, float n2, float n3) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }
    public boolean aprueba(){
        Boolean bandera = true;
        if((n1 + n2) >= 28)
            bandera = true;
        
        else if(n3 >= 24 &&((n1 + n2 + n3) / 2) >= 24)
            bandera = true;
        
        else if  ((n1+ n2) < 18 )
            bandera = false;
        else
            bandera = false;
        return bandera;
        //return (promedio()>=24);
    }

    public float promedio() {
        return ((n1 + n2 + n3) / 2);
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre +
                "\nCedula=" + cedula +
                "\nNota 1=" + n1 +
                "\nNota 2=" + n2 +
                "\nNota 3=" + n3;
    }
    
    
}
