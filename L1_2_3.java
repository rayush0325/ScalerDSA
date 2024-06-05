package ScalerArray;

//You are given an array of integers A of size N.
//Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.

//Approach
/*
find first odd number for initialization  and then minimum of odd numbers
find first even number for initialization  and then maximum of odd numbers
return max-min
 */
public class L1_2_3 {
    public static void main(String[] args){
        
        System.out.println(max_min(new int[]{1,2,3,4,5}));//input1
        System.out.println(max_min(new int[]{0,2,9}));//input2
        System.out.println(max_min(new int[]{5,7,100,1}));//input3
    }
    public static int max_min(int[] A){
        int max=0, min=0;
        int i=0, N=A.length;
        //finding first odd number
        while(i<N && A[i]%2==0){i++;}
        if(i<N){
            min=A[i];
            //finding minimum odd number
            while(i<N){
                if(A[i]%2!=0 && A[i]<min){
                    min=A[i];
                }
                i++;
            }
        }
        i=0;
        //finding first even number
        while(i<N && A[i]%2!=0){i++;}
        if(i<N){
            max=A[i];
            //finding max even number
            while(i<N){
                if(A[i]%2==0 && A[i]>max){
                    max=A[i];
                }
                i++;
            }
        }
        System.out.println("max= "+max+" min= "+min);

        return max-min;
    }
}
