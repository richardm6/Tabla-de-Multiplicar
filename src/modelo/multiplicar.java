/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author RICARDO
 */
public class multiplicar {
    public int multiplicando=0;
    
    public int[] Calcular (){
       int[] vec=new int [10];
       
       for (int i=0; i<vec.length;i++){
           vec[i]=(i+1)*multiplicando;
       }
       
       
       
       
       return vec;
    }
    
}
