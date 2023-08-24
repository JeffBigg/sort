
package sort;

public class SORT {

    public static void quicksort(int[] arr, int menor, int mayor) {
        if(menor<mayor){
            int pivot = partes(arr, menor,mayor);
            quicksort(arr, menor, pivot-1);
            quicksort(arr, pivot+1, mayor);
            
        }
    }
    public static int partes(int[] arr, int menor, int mayor){
        int pivot = arr[ mayor ];
        int i = menor -1;
        
        for (int j = menor; j<mayor; j++){
            if (arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,mayor);
        return i + 1;
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
