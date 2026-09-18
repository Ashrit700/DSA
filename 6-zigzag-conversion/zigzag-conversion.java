class Solution {
    public String convert(String s, int numRows) {
        // Edge case: If there's only 1 row or the string is shorter than the rows,
        // it just returns the exact same string.
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // Create an array of StringBuilders for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Traverse the string and place characters in the appropriate row
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            
            // If we are at the top row or the bottom row, flip the direction
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            
            // Move up or down to the next row
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows into one final string
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}