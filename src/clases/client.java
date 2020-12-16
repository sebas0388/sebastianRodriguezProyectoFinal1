/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import forms.dataEnter;

/**
 *
 * @author SebastianR
 */
public class client extends dataEnter {
    
    String name, surname, clientNum;

    public client(String name, String surname, String clientNum) {
        this.name = name;
        this.surname = surname;
        this.clientNum = clientNum;
      
    }    
    
   
    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setClientNum(String clientNum) {
        this.clientNum = clientNum;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getClientNum() {
        return clientNum;
    }
    
   
    
 }
