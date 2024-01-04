class Solution {
    public int solution(int[] num_list) {
        int first = -1;
        
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i] < 0) {
                first = i; // 첫번째 인덱스 값
                break; // 첫번째 값만 부르고 멈춤
            }
        }
        return first; 
    }
}