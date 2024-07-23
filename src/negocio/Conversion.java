/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author sebas
 */

public class Conversion {
    
    public String ConverPosFija(String expresion){
        PilaLista stack=new PilaLista();
        String posfija="";
        String [] P=expresion.split(" ");
        //String car;
        //int i = 0; i < expresion.length(); i++
        for (String car : P) {
            //car=expresion.charAt(i);
            //ystem.out.println(car);
            //System.out.println(car);
            if(conver(car)>0){
                while(!stack.vacia() && (conver(stack.get()) >= conver(car))){                   
                    posfija=posfija+stack.pop()+" ";
                    //System.out.println(posfija);
                }
                stack.push(car);
            }else if(parentesis(car)==2){
                String aux=stack.pop();
                //System.out.println(posfija);
                while(parentesis(aux)!=1){
                    posfija= posfija+aux+" ";
                    aux=stack.pop();          
                }
            }else if(parentesis(car)==1){
                stack.push(car);
            }else{
                posfija=posfija+car+" ";
                //System.out.println(posfija);
            }
        }
        for (int i = 0; i <= stack.Cantidad(); i++) {
            posfija=posfija+stack.pop()+" ";
        }       
        return posfija;
    }
    
    public int parentesis(String par){
        switch (par) {
            case "(":return 1;
            case ")":return 2;
        }
        return -1;
    }
    
    public int conver(String token){
        switch (token) {
            case "+": //implementado
            case "-":return 1;//implementado
            case "*": //implementado
            case "mod"://implementado
            case "/": //implementado         
            return 2;
            
            case "xrax":
            case "^":
            case "logB":
            case "%":
            return 3;
            
            case "sin":
            case "cos":
            case "tan":
            case "cotan":
            case "cosec":
            case "sec":
                
            case "sin-1":
            case "cos-1":
            case "tan-1":
            case "cotan-1":
            case "cosec-1":
            case "sec-1":
            
            case "sinh":
            case "cosh":
            case "tanh":
            case "cotanh":
            case "cosech":
            case "sech":    
            
            case "sinh-1":
            case "cosh-1":
            case "tanh-1":
            case "cotanh-1":
            case "cosech-1":
            case "sech-1":
                        
            case "!": //implementado 
            
            case "1/":
            case "^2"://implementado 
            case "^3":
            case "10^":
            case "2^":
            case "e^":
            case "abs":
            case "log":
            case "ln":           
            case "neg":
            
                
            case "2rax"://implementado
            case "3rax":return 4;
            case "π":
            case "e":
            return 5;
        }
        return -1;
    }
    
    
    public static void main(String[] args) {
        Conversion s=new Conversion();
        //String a="7*4+6/3+2";
        String a="5 + π";
        String p="";
        p=s.ConverPosFija(a);
        System.out.println(a);
        System.out.println(p);
    }
}
