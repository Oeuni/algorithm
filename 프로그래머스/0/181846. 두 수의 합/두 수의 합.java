import java.math.BigDecimal;
class Solution {
    public String solution(String a, String b) {
        BigDecimal bA = new BigDecimal(a);
        BigDecimal bB = new BigDecimal(b);
        
        return bA.add(bB).toString();
    }
}