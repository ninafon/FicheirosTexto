
package com.nina.lectura;

import exemficheiros.Datos;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LecturaFicheiros {
    Scanner sc ;
    
    public void lerLiña(File fich){
        try {
            sc = new Scanner(fich);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
                
        } catch (FileNotFoundException ex) {
            System.out.println("erro Liña "+ ex.toString());
        }
        
    }
    public void lerPalabra(File fich){
        try {
            sc = new Scanner(fich);
            while(sc.hasNext())
                System.out.println(sc.next());
        } catch (FileNotFoundException ex) {
            System.out.println("erro palabra "+ ex.toString());
        }
        
    }
    public void lerUsandoDelimitadores(File fich){
        List < String> lista = new ArrayList();
        String valor;
        try {
            sc= new Scanner(fich).useDelimiter("\\*,\\*");
            while(sc.hasNext()){
             valor= sc.next();
                System.out.println( valor);
                lista.add(valor);
                               
            }
            for(String ele: lista)
                System.out.println( ele);
            
        } catch (FileNotFoundException ex) {
            System.out.println("erro delimitadores "+ ex.toString());
        }
    }
    public void lerNumeros(File fich){
        List<Integer> lista = new LinkedList();
        try {
            sc = new Scanner(fich);
            int v ;
            while(sc.hasNextInt()){
               v= sc.nextInt();
                System.out.println(v);
                lista.add(v);
            }
            for(int i=0;i<lista.size();i++)
                if(lista.get(i)%2==0)
                    System.out.println(lista.get(i));
                
        } catch (FileNotFoundException ex) {
            System.out.println("erro"+ ex.getMessage());
           
        }
    }
    public List<Datos> LerObxectos(File fich){
        List <Datos>listaPersoas = new ArrayList();
        try {
            sc = new Scanner(fich);
            while(sc.hasNextLine()){
                String linea = sc.nextLine();
                // separamos os atributos pola , e extraemos unha lista de String cos atributos
                
                List<String>listaAux = Arrays.asList(linea.split(", "));
                System.out.println("**"+ listaAux.size());
                Datos p = new Datos(listaAux.get(0),listaAux.get(1),listaAux.get(2),Integer.parseInt(listaAux.get(3)));
                listaPersoas.add(p);
            }
            System.out.println(listaPersoas);
                
        } catch (FileNotFoundException ex) {
            System.out.println("erro lectura obxectos ");
        }
    
         return listaPersoas; 
        
    }
    
    
}
