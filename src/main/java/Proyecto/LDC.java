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
public class LDC {
    private Nodo head;
    
    public Nodo getHead(){return head;}
    public void setHead(Nodo n){head = n;}
    
    public LDC(){
        head = null;
    }
    
    public void Agregar(Nodo n){
        Nodo h = head;
        if(head == null){
            head = n;
            head.setPrev(head);
            head.setNext(head);
            return;
        }
        
        if(n.getDato() < head.getDato()){
            head.getPrev().setNext(n);
            n.setPrev(head.getPrev());
            n.setNext(head);
            head.setPrev(n);
            head = n;
            return;
        }
        
        do{
            if( n.getDato() < h.getNext().getDato()){
                break;
            }
            h = h.getNext();
        }while( h != head);
        
        if(n.getDato() < h.getNext().getDato()){
            h.getNext().setPrev(n);
            n.setPrev(h);
            n.setNext(h.getNext());
            h.setNext(n);
        }else{
            n.setNext(h);
            n.setPrev(h.getPrev());
            h.getPrev().setNext(n);
            h.setPrev(n);      
        }
    }
    
    public boolean Buscar(int dato){
        Nodo h = head;
        if( h != null){
            do{
                if(h.getDato() == dato){
                    return true;
                }
                h = h.getNext();
            }while( h != head);
        }
        return false;
    }
    
    
    public int ContarNodos(){
        int contador = 0;
        if ( head != null){
            Nodo h = head;
            do{
                contador++;
                h = h.getNext();
            }while(h != head);
        }
        return contador;
    }
    
    public void Borrar(int dato){
        Nodo h = head;
        while(h.getNext() != head){
            if(h.getDato() == dato){
                break;
            }
            h = h.getNext();
        }
        h.getPrev().setNext(h.getNext());
        h.getNext().setPrev(h.getPrev());
        if(h == head){
            head = head.getNext();
        }
    }
    
    public String ToString(){
       String lista = "";
        Nodo h = head;
        if( h != null){
            lista += h.ToString();
            h = h.getNext();
            while(h != head){
             lista += "," + h.ToString();
             h = h.getNext();   
            }
            return lista;
        }else{
            return "La lista esta vacia";
        }
      
    }
}
