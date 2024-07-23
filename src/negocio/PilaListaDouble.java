/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author sebas
 */
public class PilaListaDouble {
    NodoDouble cima;
    private int cantidad;
        
    public PilaListaDouble(){
       cima=null;
       cantidad=0;
    }
    public boolean vacia(){
        return cima==null;
    }
    public int Cantidad(){
        return cantidad;
    }
    public void push(double ele){
        NodoDouble p=new NodoDouble();
        p.setDato(ele);
        p.setEnlace(cima);
        cima=p;
        cantidad++;
    }
    public Double pop(){
        if(!vacia()){
            double x=cima.getDato();
            cima=cima.getEnlace();
            cantidad--;
            return x;
        }
        return -1.0;
    }
    public double get(){
        return cima.getDato();
    }
    
    public String toString(){
        String s="";
        NodoDouble aux=cima;
        while(aux!=null){
            s=s+"|"+ aux.getDato()+"|";
            s=s+"\n";
            aux=aux.getEnlace();
        }
        return s+"->null";
    }
    public static void main(String[] args) {
        PilaListaDouble pilaPrueva=new PilaListaDouble();
        String car=" * ";
        double q=Double.parseDouble(car);
                //System.out.println(q);
        pilaPrueva.push(q);
        
        System.out.println(pilaPrueva.get());
        
        /*String a="4";
        pilaPrueva.push();
        pilaPrueva.push("/");
        pilaPrueva.push("/");
        while (!pilaPrueva.vacia()){
            a+=pilaPrueva.pop();
        }
        System.out.println(a);
        //pilaPrueva.get();
        //System.out.println(pilaPrueva.get());*/
    }
}
