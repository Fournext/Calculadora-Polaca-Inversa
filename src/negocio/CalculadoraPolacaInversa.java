/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package negocio;

/**
 *
 * @author sebas
 */
public class CalculadoraPolacaInversa {


    public static void main(String[] args) {
        CalPolacoInv r=new CalPolacoInv();
        Conversion con=new Conversion();
        String s="",s2="";
        //s="48 * 88 / 2.8 - ( 23 - 15 ) ";
        //s="55.569 * 565.12";
        //s="35 / ( sin ( 50 + 10 ) ) - 98";
        s="abs ( 15 - 30 )";
        s2="15 * cosec 10";
        String c=con.ConverPosFija(s);
        String c2=con.ConverPosFija(s2);
        double a=0.0;
        double b=0.0;
        a=r.resolucion(c);
        b=r.resolucion(c2);
        //a=a*b;
        System.out.println(s);
        System.out.println(c);
        System.out.println(a);
    }
    
}
