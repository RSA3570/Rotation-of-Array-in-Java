public class RotateArray2 {
  
  void rotateArray(int arr[], int d, int n){
    
    int temp;
    
    for(int i = 0; i<d; i++){
      temp = arr[0];
      for(int j = 0; j<n-1; j++){
        arr[j] = arr[j+1];
      }
      arr[n-1] = temp;
    }
  }
  
  void printArray(int arr[], int n){
    for(int k = 0; k<n; k++){
      if(k != n-1){
        System.out.print(arr[k]+", ");
      }
      else{
        System.out.print(arr[k]);
      }
    }
  }
    
  
  public static void main(String[] args) {
    
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    int d = 2;
    int n = arr.length;
    
    RotateArray2 rotate = new RotateArray2();
    
    rotate.rotateArray(arr, d, n);
    rotate.printArray(arr, n);
    
  }
}