class Solution {
    public int solution(int hp) {
        int jang = hp / 5;
        int byeong = hp % 5;
        int il = byeong % 3;
        byeong /= 3;
        
        return jang+byeong+il;
    }
}