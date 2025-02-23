class Solution {
    public int splitNum(int num) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int temp = num;
        while(temp!=0){
            queue.offer(temp%10);
            temp/=10;
        }
        String s1="",s2="";
        while(!queue.isEmpty()){
            if(!queue.isEmpty())
                s1+=queue.poll();
            if(!queue.isEmpty())
                s2+=queue.poll();
        }
        return Integer.valueOf(s1)+Integer.valueOf(s2);
    }
}