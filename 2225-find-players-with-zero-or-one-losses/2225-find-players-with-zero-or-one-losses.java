class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        if (matches == null || matches.length == 0) {
            return List.of(List.of(0));
        }

        Set<Integer> allSet = new HashSet<>();
        Set<Integer> looserSet = new HashSet<>();
        Map<Integer,Integer> playersLostMap = new HashMap<>();
        for (int[] winnerLosser2ValueArray : matches) {
            allSet.add(winnerLosser2ValueArray[0]);
            int looser = winnerLosser2ValueArray[1];
            looserSet.add(looser);
            playersLostMap.merge(looser, 1, Integer::sum);
        }

        List<Integer> wonOnlyOnce = new ArrayList<>();

        playersLostMap.forEach((k, v) -> {
            if (v == 1) {
                wonOnlyOnce.add(k);
            }
        });
        allSet.removeAll(looserSet);
        List<Integer> neverDefeated = new ArrayList<>(allSet);
        Collections.sort(neverDefeated);
        Collections.sort(wonOnlyOnce);

        return List.of(neverDefeated, wonOnlyOnce);
    }
}