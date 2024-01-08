class Solution {
    public int solution(long num) {
        int answer = 0;
        
        while(num != 1) { // 반복문이 1이 아니면
            if(num % 2 == 0) { // 짝수
                num/=2; // 짝수이니 2로 나눔
            } else { // 홀수라면
                num = num * 3 + 1; // 3 곱하고 1 더함
            }
            answer++; // answer 증가
            
            if(answer >= 500) { // 500번 반복했는데도 1이 나오지 않는다면
                answer = -1; // -1 반환 후
                break; // 반복 멈춤
            }
        }
        return answer;
    }
}