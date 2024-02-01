class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<List<Integer>> res = gensub(nums, k);
        return convert(res);
    }

    private List<List<Integer>> gensub(int[] nums, int k) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i += 3) {
            if (i + 2 < nums.length) {
                if (nums[i + 2] - nums[i] <= k) {
                    List<Integer> subl = new ArrayList<>();
                    subl.add(nums[i]);
                    subl.add(nums[i + 1]);
                    subl.add(nums[i + 2]);
                    ans.add(subl);
                } else {
                    return new ArrayList<>(); // Return an empty list
                }
            }
        }
        return ans;
    }

    private int[][] convert(List<List<Integer>> resultL) {
        int[][] res = new int[resultL.size()][3];
        for (int i = 0; i < resultL.size(); i++) {
            List<Integer> subl = resultL.get(i);
            for (int j = 0; j < 3; j++) {
                res[i][j] = subl.get(j);
            }
        }
        return res;
    }
}