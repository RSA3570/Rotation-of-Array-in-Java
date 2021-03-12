public class InsertionSort {
    public static void main(String[] args) {
      
        int arr[] = {8,7,12,17,3,5};
        int size = arr.length;
        int temp;
        int j;

        for(int i=0; i<size; i++){
          temp = arr[i];
          j = i;

          while(j>0 && arr[j-1]>temp){
            arr[j] = arr[j-1];
            j = j-1;
          }
          arr[j] = temp;
          
        }
        
        for(int k=0; k<size; k++){
          System.out.println(arr[k]);
        }
    }
}
