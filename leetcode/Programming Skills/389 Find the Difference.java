class Solution {
    public char findTheDifference(String s, String t) {
        // 배열 선언 및 담기
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        // 배열 정렬
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // 두 배열의 길이가 다를 때
        if(sArray.length != tArray.length) {
            for(int i=0; i<sArray.length; i++) {
                // 두 배열에 있는 i번째 값이 같지 않았을 때
                if(sArray[i] != tArray[i]) {
                    return tArray[i];
                }
            }
        }
        // 두 배열의 길이가 같을 때
        return tArray[tArray.length-1];
    }
}