class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {     //HashMap Approach 
        unordered_map<int,int> m ;
        for(int i=0;i<arr.size();i++){
            m[arr[i]]++;
        }
        unordered_set<int> s;     
        for(auto ele:m){
            int count = ele.second;
            s.insert(count);
        }
        return m.size()==s.size();
    }
};