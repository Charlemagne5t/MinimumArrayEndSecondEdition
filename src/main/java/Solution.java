class Solution {
    public long minEnd(int n, int x) {
        String xS = Integer.toBinaryString(x);
        String nMinusOne = Integer.toBinaryString(n - 1);
        
        StringBuilder sb = new StringBuilder();
        int i = xS.length() - 1;
        int j = nMinusOne.length() - 1;
        while(i >= 0 || j >= 0) {
            if (i < 0) {
                sb.insert(0, nMinusOne.charAt(j));
                j--;
            } else if (j < 0) {
                sb.insert(0, xS.charAt(i));
                i--;
            } else if (xS.charAt(i) == '1') {
                sb.insert(0, '1');
                i--;
            } else if (xS.charAt(i) == '0') {
                if (j >= 0) {
                    sb.insert(0, nMinusOne.charAt(j));
                    j--;
                    i--;

                }
            }
        }

        return Long.parseLong(sb.toString(), 2);
    }
}