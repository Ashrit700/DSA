class Solution {
    // Lookup table: index 0 maps to "abc", 1 to "def", ..., 7 to "wxyz"
    private static final String[] KEYPAD = {
        "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return ans;
        
        solve(new StringBuilder(), ans, digits, 0);
        return ans;
    }

    private void solve(StringBuilder current, List<String> ans, String digits, int index) {
        // Base Case: We've processed all digits
        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }

        // Get the string of letters for the current digit
        int digit = digits.charAt(index) - '0';
        String letters = KEYPAD[digit - 2]; // Subtract 2 because keypad starts at 2

        // Backtracking: Try every letter mapped to this digit
        for (char ch : letters.toCharArray()) {
            current.append(ch);
            solve(current, ans, digits, index + 1);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }
    }
}



//         for(int i=(index-1)*3;i<index*3;i++){
//             char ch=(char)('a'+i);
//             s=s+ch;
//             solve(s,ans,digits.substring(1));
//             s= s.substring(0, s.length() - 1);;


//         }
//     }
//     public List<String> letterCombinations(String digits) {
//         List<String>ans=new ArrayList<>();
//         String s="";
//         solve(s,ans,digits);
//         return ans;
        
//     }
// }

//Niche wala code jyada better hai but not working for 7 and 9 as they have 4 letters.