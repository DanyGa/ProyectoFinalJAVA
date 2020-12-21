/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.io.*;

/**
 *
 * @author DanyG
 */
public class Writer {
    public static void Escribir(String dato, String nombre) throws IOException{
        File f = new File("C:\\Users\\Gerar\\OneDrive\\Escritorio\\" + nombre + ".txt");
        FileWriter fw = new FileWriter(f);
        fw.write(dato);
        fw.close();
}
}
