class Solution {
    public int alternatingSubarray(int[] nums) {
        int flag = nums[0]-nums[1];
        int count = -1;
        int max = -1;

        if(flag==-1) count = 2;


        for(int i=1;i<nums.length-1;i++){
            int cur = nums[i]-nums[i+1];
            if(cur!=0 && (cur==1||cur==-1) && flag != cur){
                if(count==-1)
                    if(cur==-1)
                        count=2;
                    else
                        count=-1;
                else
                    count++;
            }
            else{
                max = Math.max(count,max);
                if(count!=-1 && (cur==1||cur==-1))
                    count = 2;
                else
                    count = -1;
            }
            flag = cur;
        }
        return Math.max(count,max);
    }
}