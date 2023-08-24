/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sort1;

/**
 *
 * @author Alumno
 */
public class Sort1 {

    public static void main(String[] args) {
        
        int [] array={12,6,16,10,4,14,2};
        
        System.out.println("ARAY DESORDENADO");
             
        impArray(array);
        
        Sort(array,0,array.length -1);
        
         System.out.println("ARAY ORDENADO");
             
        impArray(array);
        
        
        
    }
}