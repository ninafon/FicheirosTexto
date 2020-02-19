
package com.nina.escritura;

import exemficheiros.Datos;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EscrituraFicheiros {
    
    PrintWriter esc= null;
   
    FileWriter fich;
    
    public void escribirNumeros(String nomeFich)
    {
        
        try {
            fich = new FileWriter(nomeFich);  //     new FileWriter(fich,true);//para engadir elementos
            esc= new PrintWriter(fich);
            esc.println(3);
            esc.println(5);
       
        } catch (IOException ex) {
            System.out.println("erro escritura numeros "+ ex.getMessage());
          
        }
       finally{
            esc.close();
        }
    }
   
    
    public void engadir(String nomeFich){
        
        try {
            fich = new FileWriter(nomeFich,true);
            esc= new PrintWriter(fich);
            esc.println(9);
            esc.println(7);
        
        } catch (IOException ex) {
            System.out.println(" erro o engadir elemento");
        }
        finally{
            esc.close();
        }
            
    }
    
   public void escribirObxectos(String nomeFich) {
        try {
            fich = new FileWriter(nomeFich);
            esc = new PrintWriter(fich);
            Datos dato1 = new Datos("aa","aa","11",1);
            esc.print(dato1.getNome()+",");
             esc.print(dato1.getApelido()+",");
             esc.print(dato1.getDni()+",");
             esc.print(dato1.getEdade()+",");
              esc.print(dato1);// escribe os datos segun o toStrin()
            
            
        } catch (IOException ex) {
            System.out.println("erro");
        }
       finally{
            esc.close();
        }
       
       
       
       
   } 
    
    
    
}
