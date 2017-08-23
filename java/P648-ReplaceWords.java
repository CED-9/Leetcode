public class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        // Java8 sort list. 
        dict.sort((a, b) -> { return a.length() - b.length(); });
        
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            boolean hasRoot = false;
            for (String root : dict) {
                if (word.startsWith(root)) {
                    result.append(root + " ");
                    hasRoot = true;
                    break;
                }
            }
            if (!hasRoot) {
                result.append(word + " ");
            }
        }
        
        // remember to trim the last " ".
        return result.toString().substring(0, result.length() - 1);
    }
}
