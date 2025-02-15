class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String str : cpdomains){
            String[] arr = str.split("\\s");
            int rep = Integer.valueOf(arr[0]);
            String[] d = arr[1].split("\\.");
            for(int i=0;i<d.length;i++){
                String ans=d[i];
                for(int j=i+1;j<d.length;j++)
                    ans+=("."+d[j]);
                map.put(ans,map.getOrDefault(ans,0)+rep);
            }
        }
        List<String> list = new ArrayList<>();
        for(String str : map.keySet())
            list.add(String.valueOf(map.get(str))+" "+str);
        return list;
    }
}