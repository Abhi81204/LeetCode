import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        List<Character> l = new ArrayList<>();

        // Add all characters of the first word to the list
        for (int i = 0; i < words[0].length(); i++) {
            l.add(words[0].charAt(i));
        }

        // Iterate through the remaining words
        for (int i = 1; i < words.length; i++) {
            List<Character> temp = new ArrayList<>();
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                if (l.contains(ch)) {
                    temp.add(ch); // Add character to temp if it exists in l
                    l.remove((Character) ch); // Remove one occurrence from l
                }
            }
            l = temp; // Update l to contain only the common characters
        }

        // Convert the remaining characters in the list to strings and add to the result list
        for (Character ch : l) {
            result.add(String.valueOf(ch));
        }

        return result;
    }
}

