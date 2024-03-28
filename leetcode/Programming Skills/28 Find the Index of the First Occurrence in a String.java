class Solution {
    public int strStr(String haystack, String needle) {
        // 코드화 하기
        // 1. needle에 있는 값이 haystack에 있을 경우 그 값이 시작되는 인덱스 위치 출력
        // 2. needle에 있는 값이 haystack에 없을 경우 -1 출력

        // indexOf(String str) 이용하기
        // indexOf는 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스 반환
        // 찾지 못했을 경우 -1 반환
        int result = haystack.indexOf(needle);
        if(result == -1) {
            return -1;
        } else {
            return result;
        }
    }
}