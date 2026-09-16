class Solution {
    public int maximumWealth(int[][] accounts) {
        int count = 0;

        for(int i = 0; i < accounts.length; i++) {
            int ok = 0;

            for(int j = 0; j < accounts[i].length; j++) {
                ok += accounts[i][j];
            }

            count = Math.max(count, ok);
        }

        return count;
    }
}