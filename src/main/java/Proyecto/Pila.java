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
public class Pila {
    private NodoPila top;
    public NodoPila getTop(){return top;}
    public void setTop(NodoPila n){top = n;}
    
    
    public int getCount(){
    int c = 0;
    NodoPila t = top;
    while(t != null){
        c++;
        t = t.getNext();
    }
    return c;
}
    public Pila(){
        top = null;
    }
    
    public void Push(NodoPila n){
        n.setNext(top);
        top = n;
    }
    public NodoPila Pop(){
        NodoPila regreso = top;
        if (top != null){
            top = top.getNext();
        }
        return regreso;
    }
    
    public String ToString(){
        String stringpila = "";
        NodoPila t = top;
        if(t != null){
        stringpila += t.ToString();
        t = t.getNext();
        while( t != null){
            stringpila += "," + t.ToString();
            t = t.getNext();
        }
        return stringpila;   
    }else{
            return "La pila esta vacia";
        }
    }
    
    
    
}
