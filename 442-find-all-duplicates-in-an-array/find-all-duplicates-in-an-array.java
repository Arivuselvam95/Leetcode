class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        Set<Integer> list = new HashSet<>();
        Arrays.sort(arr);
        int index = 0;
        for(int i=0;i<arr.length-1;i++)
            if(arr[i]==arr[i+1])
                list.add(arr[i]);
        return new ArrayList<>(list);                
    }
}