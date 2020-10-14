/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;

/**
 *
 * @author working
 */
public class Busquedas {
    
    public static int[] busquedaLineal (int[][] datos, int x){
        
        int[] pos = new int[2];
        for(int y = 0; y<datos.length; y++)
        {
            for(int n =0; n<datos.length; n++)
            {
                if(datos[y][n] == x)
                {
                    pos[0] = y;
                    pos[1] = n;
                    return pos;
                }
            }
            
        }
        
        pos[0] = -1;
        pos[1] = -1;
        return pos;
    }
}
