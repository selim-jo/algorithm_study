class Solution {
    public String mergeAlternately(String word1, String word2) {

        // StringBuilder는 문자열이 변경될 때마다 새로운 메모리를 할당받는 것이 아니라, 
        // 버퍼를 통해 문자열을 관리하고 있다가 toString()을 통해 String 객체를 생성하게 됨
        // 결과값 선언
        StringBuilder result = new StringBuilder();
        
        int i = 0;
        int j = 0;

        // word1의 길이보다 작고, word2의 길이보다 작을 동안 수행
        while(i < word1.length() && j < word2.length()) {
            // 글자 하나하나를 charAt을 이용해 뽑고, append 메서드 이용해 추가
            result.append(word1.charAt(i)).append(word2.charAt(j));
            i++;
            j++;
        }

        // 남는 문자 붙여주기 (ex) word1의 글자가 길 때 or word2의 글자가 길 때)
        result.append(word1.substring(i)).append(word2.substring(j));

        // String 객체를 생성하여 결과값 반환
        return result.toString();
    }
}