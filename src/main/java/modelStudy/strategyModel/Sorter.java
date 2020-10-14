package modelStudy.strategyModel;


public class Sorter<T> {
    public  void sort(T [] a,MyComparator<T> comparator){
        int len = a.length;
        for(int i=0;i<len-1;i++){
            int msPos = i;
            for (int j=i+1;j<len;j++){
                msPos= comparator.compare(a[j],a[msPos])==1?j:msPos;
            }
            swap(a,i,msPos);
        }
    }
    void swap(T [] arr ,int i,int j){
        T temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
