import java.util.Arrays;

class Solution {
    public int videoStitching(int[][] clips, int time) {
        // Sort by start time ascending; if starts are equal, pick larger end time first
        Arrays.sort(clips, (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(b[1], a[1]));

        // If no clip can start from 0, it's impossible
        if (clips[0][0] != 0) {
            return -1;
        }

        int n = clips.length;
        int s = 0;        // Current covered boundary
        int farthest = 0; // Farthest reach discovered among valid clips
        int count = 0;
        int i = 0;

        for (i = 0; i < n; i++) {
            // Check if current clip can extend the existing coverage
            if (clips[i][0] <= s) {
                farthest = Math.max(farthest, clips[i][1]);
            } else {
                // We reached a clip that starts beyond our current boundary 's'
                // Commit the best clip found so far
                count++;
                s = farthest;

                // If even after committing we still cannot reach this clip's start, there is a gap
                if (clips[i][0] > s) {
                    return -1;
                }

                // Update reach with current clip
                farthest = Math.max(farthest, clips[i][1]);
            }

            // If we've reached or passed the target duration
            if (farthest >= time) {
                return count + 1;
            }
        }

        // Commit the final clip if it reached the target
        if (farthest >= time) {
            return count + 1;
        }

        return -1;
    }
}