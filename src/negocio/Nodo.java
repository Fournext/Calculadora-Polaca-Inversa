/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author sebas
 */

public class Nodo {
    String dato;
    Nodo Enlace;
    public Nodo(){
        this.Enlace=null;
    }
    
    public Nodo(String dato, Nodo Enlace) {
        this.dato = dato;
        this.Enlace = Enlace;
    }
    public void setDato(String dato){
        this.dato=dato;
    }
    public void setEnlace(Nodo Enlace){
        this.Enlace=Enlace;
    }
    public Nodo getEnlace(){
        return Enlace;
    }
    public String getDato(){
        return this.dato;
    }
    
    @Override
    public String toString(){
        return(dato+"->");
    }
}
