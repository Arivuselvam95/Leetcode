class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int candy : candies)
            max = Math.max(max,candy);
        for(int candy : candies)
            list.add((candy+extraCandies)>=max);
        return list;
    }
}