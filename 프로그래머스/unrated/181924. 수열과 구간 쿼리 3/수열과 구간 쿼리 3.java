class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int a, b, n = 0;
        for(int i = 0; i<queries.length; i++) { 
            a = queries[i][0];
            b = queries[i][1];
            
            n = arr[a];
            arr[a] = arr[b];
            arr[b] = n;
        }
        return arr;
    }
}