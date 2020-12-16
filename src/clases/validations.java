/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author SebastianR
 */
public class validations {

 //Clase donde estan todas las validaciones usadas para cada dato solicitado del cliente.   
    
public validations() {
    }
    
    
//Valida que la palabra ingresa no sea vacia.    
public boolean empty(String word) {

if (!(word.isEmpty())) {
    
        return true;
}else {
        return false;
       }
     }
    
//El numero ingresado que es tomado como texto, lo pasa a entero y valida que sea mayor a cero y no este vacio.    
public boolean mayor (String word){
    
    int number = Integer.parseInt(word);
    
    if ( number <= 1 || word.isEmpty() ){
        
         return false ;           
 }else {          
         return true;   
       }
     }
   }