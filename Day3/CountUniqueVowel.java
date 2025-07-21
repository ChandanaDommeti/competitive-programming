/*
Count Unique Vowel Strings - GeeksforGeeks
Difficulty: MediumAccuracy: 57.24%Submissions: 3K+Points: 4
You are given a lowercase string s, determine the total number of distinct strings that can be formed using the following rules:

Identify all unique vowels (a, e, i, o, u) present in the string.
For each distinct vowel, choose exactly one of its occurrences from s. If a vowel appears multiple times, each occurrence represents a unique selection choice.
Generate all possible permutations of the selected vowels. Each unique arrangement counts as a distinct string.
Return the total number of such distinct strings.

Examples:

Input: s = "aeiou"
Output: 120
Explanation: Each vowel appears once, so the number of different strings can form is 5! = 120.
Input: s = "ae"
Output: 2
Explanation: Pick a and e, make all orders → "ae", "ea".
Input: s = "aacidf"
Output: 4 
Explanation: Vowels in s are 'a' and 'i', Pick each 'a' once with a single 'i', make all orders → "ai", "ia", "ai", "ia".
Constraints:
1 ≤ s.size() ≤ 100
*/
import java.util.*;

class CountUniqueVowel {
    public int vowelCount(String s) {
        s = s.toLowerCase();
        
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        
        Map<Character, Integer> freq = new HashMap<>();
        
        for (char ch : s.toCharArray()) {
            if (vowels.contains(ch)) {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
        }

        int uniqueVowels = freq.size();
        if (uniqueVowels == 0) return 0;

        int product = 1;
        for (int count : freq.values()) {
            product *= count;
        }
        int factorial = 1;
        for (int i = 1; i <= uniqueVowels; i++) {
            factorial *= i;
        }

        return product * factorial;
    }
}
