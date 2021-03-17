public class RotateArray {
  
    void rotateArray(int arr[], int d, int n){
      
      int[] temp = new int[d];
      
      for(int i = 0; i<d; i++){
        temp[i] = arr[i];
      }
      
      for(int j = 0; j<d; j++){
        for(int m = 0; m<n-1; m++){
          arr[m] = arr[m+1];
        }
      }
      
      for(int k = 0; k<d; k++){
        arr[n-d+k] = temp[k];
      }
      
      for(int l = 0; l<n; l++){
        System.out.print(arr[l]+", ");
      }
      
    }
    
    public static void main(String[] args) {
      
      int arr[] = {1, 2, 3, 4, 5, 6, 7};
      int d = 2;
      int n = arr.length;
      
      RotateArray rotate = new RotateArray();
      rotate.rotateArray(arr, d, n);
      
    }
}