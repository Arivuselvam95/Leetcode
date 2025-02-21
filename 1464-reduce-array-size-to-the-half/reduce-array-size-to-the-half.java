class Solution {
    public int minSetSize(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }else{
                list.add(count);
                count=1;
            }
        }
        list.add(count);
        Collections.sort(list, Collections.reverseOrder());
        count=0;
        int sum=0;
        for(int i: list){
            sum+=i;
            count++;
            if(sum>=arr.length/2)
                return count;
        }
        return count;
    }
}