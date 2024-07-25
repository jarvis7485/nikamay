import java.util.*;
import java.io.*;
class QuickSort{
  static int max=5000;
  void quick(int arr[],int l,int h){
    int s;
    if(l<h){
      s = partition(arr,l,h);
      quick(arr,l,s-1);
      quick(arr,s+1,h);
    }
  }
  int partition(int arr[],int l,int h){
    int p,i,j,temp;
    p = arr[l];
    i = l+1;
    j = h;
    while(l<h){
      while(arr[i]<p && i<h){
        i++;
      }
      while(arr[j]>p){
        j--;
      }
      if(i<j){
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
      else{
        temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;
        return j;
      }
    }
    return j;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of ele: ");
    int n = sc.nextInt();
    Random gen = new Random();
    int arr[] = new int[max];
    for(int i=0;i<n;i++){
      arr[i] = gen.nextInt(1000);
    }
    System.out.println("Random ele: ");
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    long start = System.nanoTime();
    QuickSort qs = new QuickSort();
    qs.quick(arr,0,n-1);
    long stop = System.nanoTime();
    System.out.println("array after sorting: ");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println("Time taken: "+(stop-start));

  }

}
