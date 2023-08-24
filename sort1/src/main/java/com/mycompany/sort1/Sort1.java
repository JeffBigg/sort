/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sort1;

/**
 *
 * @author Alumno
 */
public class Sort1 { //clase 

    public static void main(String[] args) {  //metodo principal
        
        int [] array={12,-6,16,-30,4,14,2}; // areglo 
         
        System.out.println("ARAY DESORDENADO ASI COMO VIVES ");
             
        impArray(array); //metodo 
        
        Sort(array,0,array.length -1);//  contar 
        
         System.out.println("ARAY ORDENADO ASI ES COMO DEBE ESTAR  ");
             
        impArray(array);//metodo
        
        
       
    }
    //  
    
   //menor- mayor baja en gradas -1  // suube gradas +1 
    
   
    public static void Sort(int[] array, int low, int high) {
    if (low < high) {
        int pivotIndex = dividir(array, low, high); // funcion
        Sort(array, low, pivotIndex - 1);  //recursiva
        Sort(array, pivotIndex + 1, high);//
    }
     // seleccion de pivote
    } public static int dividir(int[] array, int low, int high) {
    int pivot = array[high];
    // realizar un seguimiento de la posición donde se colocarán
    //los elementos menores que el pivote durante el proceso de partición.
    int i = low - 1;
    
     // recorre cada elemento 
    for (int j = low; j < high; j++) {
        if (array[j] < pivot) {
            i++;
            cambio(array, i, j);
        }
    }
    
   // pone 
    cambio(array, i + 1, high);
    return i + 1;
    
//intercambio de datos
    }public static void cambio(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}
    
    
    public static void impArray(int[] array) {
    for (int num : array) {
        System.out.print(num + "  ");
    }
    System.out.println();
}

}

  
