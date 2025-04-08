class Solution {
    public String frequencySort(String s) {
        HashMap<Integer,PriorityQueue<Character>> map = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        char[] str = s.toCharArray();
        Arrays.sort(str);
        int n = str.length;
        int count = 1;
        for(int i=0;i<n-1;i++){
            if(str[i]==str[i+1])
                count++;
            else{
                if(!queue.contains(count))
                    queue.offer(count);
                if(map.containsKey(count)){
                    map.get(count).offer(str[i]);
                }else{
                    PriorityQueue<Character> q = new PriorityQueue<>();
                    q.offer(str[i]);
                    map.put(count,q);
                }
                count=1;
            }
        }
        if(!queue.contains(count))
            queue.offer(count);
        if(map.containsKey(count)){
            map.get(count).offer(str[n-1]);
        }else{
            PriorityQueue<Character> q = new PriorityQueue<>();
            q.offer(str[n-1]);
            map.put(count,q);
        }
        String ans="";
        while(!queue.isEmpty()){
            int m = queue.poll();
            for(char ch: map.get(m)){
                String temp = "";
                for(int i=0;i<m;i++)
                    temp+=ch;
                ans+=temp;
            }
        }
        return ans;
    }
}