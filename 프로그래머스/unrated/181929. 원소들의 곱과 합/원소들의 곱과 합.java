class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int ss = 1;
        
        for(int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            ss *= num_list[i];
        }
        
        if(sum * sum > ss) {
            answer = 1;
        }
        return answer;
    }
}