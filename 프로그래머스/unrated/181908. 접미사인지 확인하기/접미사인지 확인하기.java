class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        for(int i=0; i<my_string.length(); i++) {
            String str = my_string.substring(i, my_string.length());
            // 처음 인덱스부터 my_string 크기만큼 str에 넣기
            if(str.equals(is_suffix)) { //str 문자열에서 is_suffix 비교
                answer = 1;
            }
        }
        return answer;        
    }
}