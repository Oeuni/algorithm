class Solution {
    public String[] solution(String[] picture, int k) {
        String[] arr = new String[picture.length * k];
        
        // 0, 2, 4, 6, 8, 10, 12에 저장
        for (int i = 0; i < picture.length; i++) {
        	arr[i*k] = "";
        	for (int j = 0; j < picture[i].length(); j++) {
				for (int j2 = 0; j2 < k; j2++) {
					arr[i*k] += picture[i].charAt(j);
				}
			}
		}
        
        for (int i = 0; i < arr.length; i+=k) {
			for (int j = 0; j < k; j++) {
				arr[i+j] = arr[i];
			}
		}
        return arr;
    }
}