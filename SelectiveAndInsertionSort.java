public class SelectiveAndInsertionSort {
    public static void main(String[] args){
        insertionSort(['1'], 1);
    }
    public void insertionSort(int a[], int n){
        int i, j, t;
        for(i=1; i<=n; i++){
            for(j=i; j>0; j--){
                if(a[j] < a[j-1]){
                    t = a[j];
                    a[j] = a[j-1];
                    a[j-1] = t;
                }
            }
        }
    }
}
