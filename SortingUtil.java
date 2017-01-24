
public class SortingUtil {
    public static int[] insertionSort(int []a){
        for(int j=1;j<a.length;j++){
            int key = a[j];
            int i = j - 1;
            while(i>=0&&a[i]>key){
                a[i+1] = a[i];
                i = i-1;
            }
            a[i+1] = key;
        }
        return a;
    }

    public static int[] selectionSort(int []a){
        for(int i=0;i<a.length-1;i++){
            int key = a[i];
            int index = i;
            for(int j=i+1;j<a.length;j++){
                if(key>a[j]){
                    key = a[j];
                    index = j;
                }
            }
            a[index] = a[i];
            a[i] = key;
        }
        return a;
    }
}
