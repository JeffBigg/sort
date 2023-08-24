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
    public static void Sort(int[] array, int low, int high) {
    if (low < high) {
        int pivotIndex = dividir(array, low, high);
        Sort(array, low, pivotIndex - 1);
        Sort(array, pivotIndex + 1, high);
    }
     
    } public static int dividir(int[] array, int low, int high) {
    int pivot = array[high];
    int i = low - 1;
    
    for (int j = low; j < high; j++) {
        if (array[j] < pivot) {
            i++;
            cambio(array, i, j);
        }
    }
    
    cambio(array, i + 1, high);
    return i + 1;
    }
   
   
}
    
    

 
