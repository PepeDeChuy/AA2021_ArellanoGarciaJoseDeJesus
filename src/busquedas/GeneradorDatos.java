/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;

import java.util.Random;

/**
 *
 * @author working
 */
public class GeneradorDatos {
    
    // "aleatorio"
    public static int[][] generarArregloInt(int x, int dim, int bound){
        int[][] arreglo = new int[dim][dim];
        
        Random ran = new Random();
       
        for(int y=0; y < dim; y++)
        {
            for(int n =0; n<dim; n++)
            {
                arreglo[y][n] = ran.nextInt(bound);
            }
        }
        
        int pos1 = ran.nextInt(dim);
        int pos2 = ran.nextInt(dim);
        
        arreglo[pos1][pos2] = x;
        return arreglo;
    }
}
