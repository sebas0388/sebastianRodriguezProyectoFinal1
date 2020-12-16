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

    
public validations() {
    }
    
    
    
public boolean empty(String word) {

if (!(word.isEmpty())) {
    
        return true;
}else {
        return false;
       }
     }
    
    
public boolean lenght (String word){
    
    int number = Integer.parseInt(word);
    
    if ( number <= 1 || word.isEmpty() ){
        
         return false ;           
 }else {          
         return true;   
       }
     }
   }