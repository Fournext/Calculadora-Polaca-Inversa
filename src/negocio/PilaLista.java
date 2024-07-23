/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author sebas
 */
public class PilaLista {
    Nodo cima;
    private int cantidad;
        
    public PilaLista(){
       cima=null;
       cantidad=0;
    }
    public boolean vacia(){
        return cima==null;
    }
    public int Cantidad(){
        return cantidad;
    }
    public void push(String ele){
        Nodo p=new Nodo();
        p.setDato(ele);
        p.setEnlace(cima);
        cima=p;
        cantidad++;
    }
    public String pop(){
        if(!vacia()){
            String x=cima.getDato();
            cima=cima.getEnlace();
            cantidad--;
            return x;
        }
        return ".";
    }
    public String get(){
        return cima.getDato();
    }
    
    public String toString(){
        String s="";
        Nodo aux=cima;
        while(aux!=null){
            s=s+"|"+ aux.getDato()+"|";
            s=s+"\n";
            aux=aux.getEnlace();
        }
        return s+"->null";
    }
    public static void main(String[] args) {
        PilaLista pilaPrueva=new PilaLista();
        String a="4";
        pilaPrueva.push("+");
        pilaPrueva.push("/");
        pilaPrueva.push("/");
        while (!pilaPrueva.vacia()){
            a+=pilaPrueva.pop();
        }
        System.out.println(a);
        //pilaPrueva.get();
        //System.out.println(pilaPrueva.get());
    }
}
