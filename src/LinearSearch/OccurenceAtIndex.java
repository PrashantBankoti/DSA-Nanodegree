package LinearSearch;

import java.util.Arrays;

public class OccurenceAtIndex {

    public static int[] search(int[]arr, int item){
        int[] arr2=new int[arr.length];
        int counter=0;
        Arrays.fill(arr2,-1);

        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                arr2[counter]=i;
                counter++;
            }

        }
        return arr2;

    }

    public static void main(String[] args) {
        int[] arr={10,2,3,10,40,20,10};
        int item=10;
        int[] result= search(arr,item);

        if(result[0]==-1){
            System.out.print("The item is not in the array");
        }else{
            for(int i=0;i< result.length;i++){
                if(result[i]==-1) break;
                System.out.print(result[i]+" ");
            }
        }

    }
}
