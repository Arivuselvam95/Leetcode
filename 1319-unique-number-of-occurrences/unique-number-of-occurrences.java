class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int count = 1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
                count++;
            else{
                if(list.contains(count))
                    return false;
                list.add(count);
                count = 1;
            }
        }
        if(list.contains(count))
            return false;
        return true;
    }
}