public class BubbleSort {
    public static void main(String[] args) {
	    
        int arr[] = {8,7,12,17,3,5};
        int size = arr.length;
        int temp;
        
        for(int i=0; i<size; i++){
          for(int j=0; j<size-1-i; j++){
            if(arr[j]>arr[j+1]){
              temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
            }
          }
        }
        
        System.out.printf("Sorted array items in ascending order: ");
        for(int k=0; k<size; k++){
          System.out.printf(arr[k]+" ");
        }
      }
}
