/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.regex.MatchResult;

/**
 *
 * @author sebas
 */
public class CalPolacoInv {
    
    public double resolucion(String expresion){
        double res=0.0;
        PilaListaDouble stack=new PilaListaDouble();
        String [] P=expresion.split(" ");
        Conversion conversion=new Conversion();
        for (String car : P){
           
            if(conversion.conver(car)>0 && conversion.conver(car)<=3){
                double op1=stack.pop();
                double op2=stack.pop();
                double aux=operacion2(op1, op2, car);
                stack.push(aux);
                //System.out.println(stack.get());
            }else if(conversion.conver(car)==4){
                double op1=stack.pop();
                double aux=operacion1(op1, car);
                stack.push(aux);
            }else if(conversion.conver(car)==5){
                double aux=operacion0(car);
                stack.push(aux);
            }else{
                double q=Double.parseDouble(car);
                //System.out.println(q);
                stack.push(q);
            }
        }
        res=stack.pop();      
        return res;
    }
    
    public double operacion0(String token){
        switch (token) {
            case "π": return Math.PI;
            case "e": return Math.exp(1.00);
        }
        
        return 0.0;
    }
    
    public double operacion1(double op1,String token){
        switch (token) {
            case "sin": return Math.sin(op1);
            case "cos": return Math.cos(op1);
            case "tan": return Math.tan(op1);
            case "cotan": return 1/Math.tan(op1);
            case "cosec": return 1/Math.sin(op1);
            case "sec": return 1/Math.cos(op1);
            
            case "sin-1": return Math.asin(op1);
            case "cos-1": return Math.acos(op1);
            case "tan-1": return Math.atan(op1);
            case "cotan-1": return Math.atan(1/op1);
            case "cosec-1": return Math.asin(1/op1);
            case "sec-1": return Math.acos(1/op1);
            
            case "sinh": return Math.sinh(op1);
            case "cosh": return Math.cosh(op1);
            case "tanh": return Math.tanh(op1);
            case "cotanh": return 1/Math.tanh(op1);
            case "cosech": return 1/Math.sinh(op1);
            case "sech": return 1/Math.cosh(op1);
            
            case "sinh-1": return Math.log(op1+Math.sqrt((Math.pow(op1, 2.00))+1));
            case "cosh-1": return Math.log(op1+Math.sqrt((Math.pow(op1, 2.00))-1));
            case "tanh-1": return Math.log((1+op1)/(1-op1))/2;
            case "cotanh-1": return Math.log((op1+1)/(op1-1))/2;
            case "sech-1": return Math.log((1+Math.sqrt(1-Math.pow(op1, 2.00)))/(op1));
            case "cosech-1": return Math.log((1/op1)+((Math.sqrt(1+Math.pow(op1, 2.00)))/Math.abs(op1)));
            
            case "!": return factorial(op1);//implementado 
            
            case "^2": return Math.pow(op1, 2.00);//implementado
            case "^3": return Math.pow(op1, 3.00);
            case "10^": return Math.pow(10.00, op1);
            case "2^": return Math.pow(2.00, op1);
            case "1/": return 1.00/op1;
            
            case "abs": return Math.abs(op1);
            case "log": return Math.log10(op1);
            case "ln": return Math.log(op1);
            case "e^": return Math.exp(op1);
            case "neg": return (op1)*-1;
 
            
            case "2rax": return Math.sqrt(op1);//implementado
            case "3rax": return Math.cbrt(op1);
        }
        
        return 0.0;
    }
    
    public double operacion2(double op1,double op2,String token){
        switch (token) {
            case "+": return op1+op2;//implementado
            case "-": return op2-op1;//implementado
            case "*": return op1*op2;//implementado
            case "/": return op2/op1;//implementado
            case "mod": return op2%op1;//implementado
            case "^": return Math.pow(op2, op1);   
            case "logB": return log(op2, op1);
            case "xrax": return Math.pow(op1,1.00/op2);
            case "%": return porcentaje(op1,op2);
            /*case "sin": return Math.sin(op1);
            case "cos": return Math.cos(op1);*/
        }
        
        return 0.0;
    }
    
    public static int factorial( double numero ) {
      int fact = 1;
      for( int i = 1; i <= numero; i++ ) {
         fact *= i;
      }
 
      return fact;
    }
    
    private static Double log(double num, double base) {
      return (Math.log10(num) / Math.log10(base));
    }
    
    private static double porcentaje(double num, double porcentaje){
        return (num*porcentaje)/100;
    }
    
    public static void main(String[] args) {
        CalPolacoInv r=new CalPolacoInv();
        Conversion con=new Conversion();
        String s="2 xrax 4";
        double q;
        String c=con.ConverPosFija(s);
        q=r.operacion2(3,3,"1/");
        double a=0.0;
        /*a=r.resolucion(c);
        System.out.println(s);
        System.out.println(c);*/
        System.out.println(q);
    }
}
