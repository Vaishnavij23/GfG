/*Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.*/

class Solution {
    int missingNumber(int array[], int n) {
        Arrays.sort(array);
        int sum=0;
        int new_sum=0;
        int result;
        for(int i=0;i<array.length;i++){
             sum=sum+array[i];
        }
        new_sum=(n*(n+1)/2);
        result=new_sum-sum;
        return result;
    }
}
