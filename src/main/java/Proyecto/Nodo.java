/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author DanyG
 */
public class Nodo {
    private int dato;
    private Nodo next;
    private Nodo prev;
    
    public Nodo(){
        dato = 0;
        next = null;           
        prev = null;
    }
    
    public int getDato(){return dato;}
    public Nodo getNext(){return next;}
    public Nodo getPrev(){return prev;}
    public void setDato(int d){dato = d;}
    public void setNext(Nodo n){next = n;}
    public void setPrev(Nodo n){prev = n;}

    public String ToString(){
        return dato + "";
    }
}
