/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller008;

/**
 *
 * @author USUARIO PC
 */
public class Problema01 {
    public static void main(String[] args) {
        String cadena = "Universidad";
        String suma= "";
        char variable;
        
        for ( int i = 0; i < cadena.length(); i++){          
            variable =  cadena.charAt(i);
            // Secuencia necesaria para repetir el mismo char.
            for (int j = 0; j <= i; j++) { 
                 System.out.printf("%s", variable);  
            }
            System.out.println(""); 
        }
    }
    
}
