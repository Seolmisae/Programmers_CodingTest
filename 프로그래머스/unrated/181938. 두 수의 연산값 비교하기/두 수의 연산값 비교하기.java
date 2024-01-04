class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        int abValue = Integer.parseInt(ab);
        int ab2 = a*b*2;
        
        if(abValue>=ab2) {
            return abValue;
        } else {
            return ab2;
        }
        
    }
}