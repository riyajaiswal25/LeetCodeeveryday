class Solution {
    public String convert(String s, int n) {
        if (n == 1)
            return s;
        String a[] = new String[n];
        Arrays.fill(a, "");
        int ind = 0;
        boolean nxt = true;
        for (int i = 0; i < s.length(); i++) {
            a[ind] = a[ind] + s.charAt(i);
            if (ind == n - 1)
                nxt = false;
            else if (ind == 0)
                nxt = true;
            if (nxt)
                ind++;
            else
                ind--;
        }
        String s1 = "";
        for (String i : a) {
            s1 += i;
        }
        return s1;
    }
}