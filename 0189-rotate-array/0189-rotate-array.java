class Solution {
    public void rotate(int[] n, int k) {
        if (n == null || n.length == 0) {
            return;
        }
        k = k % n.length;
        if (k > n.length) {
            return;
        }
        int[] temp = new int[k];
        for (int i = n.length - k; i < n.length; i++) {
            temp[i - (n.length - k)] = n[i];
        }
        for (int i = n.length - k - 1; i >= 0; i--) {
            n[i + k] = n[i];
        }
        for (int i = 0; i < k; i++) {
            n[i] = temp[i];
        }
    }
}