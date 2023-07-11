/*Given a sorted array of size N and an integer K, find the position(0-based indexing) at which K is present in the array using binary search.*/

class Solution{
    int binarysearch(int arr[], int n, int k){
        for(int i=0;i<n;i++){
           if(arr[i]==k){
              return i;
           }
        }
        return -1;
    }
}
