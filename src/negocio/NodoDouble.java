/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author sebas
 */

public class NodoDouble {
    double dato;
    NodoDouble Enlace;
    public NodoDouble(){
        this.Enlace=null;
    }
    
    public NodoDouble(double dato, NodoDouble Enlace) {
        this.dato = dato;
        this.Enlace = Enlace;
    }
    public void setDato(Double dato){
        this.dato=dato;
    }
    public void setEnlace(NodoDouble Enlace){
        this.Enlace=Enlace;
    }
    public NodoDouble getEnlace(){
        return Enlace;
    }
    public double getDato(){
        return this.dato;
    }
    
    @Override
    public String toString(){
        return(dato+"->");
    }
}
