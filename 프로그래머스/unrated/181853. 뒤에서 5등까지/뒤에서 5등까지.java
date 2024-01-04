import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list); // 오름차순 메소드
        
        for(int i=0; i<5; i++) {
           answer[i] = num_list[i];
        }
        return answer;
    }
}