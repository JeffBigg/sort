
package sort;

public class SORT {

    public static void quicksort(int[] arr, int menor, int mayor) {
        if(menor<mayor){
            int pivot = partition(arr, menor,mayor);
            quicksort(arr, menor, pivot-1);
            quicksort(arr, pivot+1, mayor);
            
        }
    }
    
}
