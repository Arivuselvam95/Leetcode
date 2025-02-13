class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        int index = 0;
        for(int i=0;i<arr.length-1;i++)
            if(arr[i]==arr[i+1] && !list.contains(arr[i]))
                list.add(arr[i]);
        return list;                
    }
}