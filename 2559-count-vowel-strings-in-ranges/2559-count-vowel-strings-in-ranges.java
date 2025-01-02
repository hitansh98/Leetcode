class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] sumArray = new int[words.length];
        for(int i=0;i<words.length;i++) {
            String word = words[i];
            int wordLength = word.length();
            if((word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'o' || word.charAt(0) == 'u' || word.charAt(0) == 'i') &&
            (word.charAt(wordLength - 1) == 'a' || word.charAt(wordLength - 1) == 'e' || word.charAt(wordLength - 1) == 'o' || word.charAt(wordLength - 1) == 'u' || word.charAt(wordLength - 1) == 'i' )) {
                sumArray[i] += 1;
            }
            if(i != 0) {
                sumArray[i] += sumArray[i-1];
            }
        }

        System.out.println(Arrays.toString(sumArray));

        int[] result = new int[queries.length];
        for(int i=0;i<result.length;i++) {
            int[] query = queries[i];
            result[i] = sumArray[query[1]] - sumArray[query[0]];
            String borderWord = words[query[0]];
            int borderWordLength = borderWord.length();
            if((borderWord.charAt(0) == 'a' || borderWord.charAt(0) == 'e' || borderWord.charAt(0) == 'o' || borderWord.charAt(0) == 'u' || borderWord.charAt(0) == 'i') &&
            (borderWord.charAt(borderWordLength - 1) == 'a' || borderWord.charAt(borderWordLength - 1) == 'e' || borderWord.charAt(borderWordLength - 1) == 'o' || borderWord.charAt(borderWordLength - 1) == 'u' || borderWord.charAt(borderWordLength - 1) == 'i')) {
                result[i] += 1;
            }
        }

        return result;
    }
}