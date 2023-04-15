class Solution {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int[] maxValue = new int[k + 1];
    int[] pileSum = new int[k + 1];
    for (List<Integer> pile : piles) {
      int pileSize = Math.min(k, pile.size()), tempSum = 0;
      for (int i = 1; i <= pileSize; i++)
        pileSum[i] = tempSum += pile.get(i - 1);
      for (int i = k; i > 0; i--)
        for (int j = 1; j <= Math.min(i, pileSize); j++)
          maxValue[i] = Math.max(maxValue[i], pileSum[j] + maxValue[i - j]);
    }
    return maxValue[k];
    }
}