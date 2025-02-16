class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> lossCount = new HashMap<>();
        Set<Integer> players = new HashSet<>();
        for (int[] match : matches) {
            int winner = match[0], loser = match[1];
            players.add(winner);
            players.add(loser);
            lossCount.put(loser, lossCount.getOrDefault(loser, 0) + 1);
        }
        List<Integer> noLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();
        for (int player : players) {
            int losses = lossCount.getOrDefault(player, 0);
            if (losses == 0) {
                noLoss.add(player);
            } else if (losses == 1) {
                oneLoss.add(player);
            }
        }
        Collections.sort(noLoss);
        Collections.sort(oneLoss);
        return Arrays.asList(noLoss, oneLoss);
    }
}