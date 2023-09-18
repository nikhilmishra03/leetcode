class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int ans ; 
        unordered_map<int,int> m; 
        for(int i=0;i<nums.size();i++){
            m[nums[i]]++;
        }
        for(auto ele:m){
            int c = ele.second;
            if (c==1){
                ans = ele.first;
            }
        }
        return ans;
    }
};