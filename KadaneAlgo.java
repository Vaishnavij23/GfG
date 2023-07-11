/*Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.*/

class Solution{
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        long curr=0;
        long maxx=Long.MIN_VALUE;
        if(n==0){
            return 0;
        }
        for(int i=0;i<n;i++){
            curr=curr+arr[i];
            maxx=Math.max(maxx,curr);
            if(curr<0){
              curr=0;
            }
        }
        return maxx;
    }
}



