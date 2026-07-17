class Solution {
    public int climbStairs(int n) {

        if (n <= 2)
            return n;

        ArrayList<Integer> kk = new ArrayList<>();

        kk.add(1);
        kk.add(2);

        while (kk.size() < n) {
            int last = kk.get(kk.size() - 1);
            int secondLast = kk.get(kk.size() - 2);

            kk.add(last + secondLast);
        }

        return kk.get(kk.size() - 1);
    }
}