/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa20201;

import busquedas.GeneradorDatos;
import busquedas.Busquedas;
import static busquedas.Busquedas.busquedaLineal;

/**
 *
 * @author working
 */
public class AA20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        int[][] aux = GeneradorDatos.generarArregloInt(8,10,10);
        
        System.out.print("[*]");
        for(int l =0; l<aux.length; l++)
        {
            System.out.print("["+l+"]");
        }
        System.out.println();
        for(int l =0; l<aux.length; l++)
        {
            System.out.print("["+l+"]");
            for(int o = 0; o<aux.length; o++)
            { 
                System.out.print("-"+aux[l][o]+"-");
            }
            System.out.println();
        }
        
        int[] pos = busquedaLineal(aux, 8);
        
        System.out.println("----------------------------------------------------"); 
        if(pos[0] != -1)
        {
           System.out.println("La posision del numero es: "+pos[0]+","+ pos[1]); 
        }
        else
        {
            System.out.println("No se encuentra en el arreglo");
        }
        
    }
    
}
