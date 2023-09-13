class Solution {
public:
    int lengthOfLastWord(string s) {
        int ans=0,c=0;
        
            for(int i=s.size()-1;i>=0;i--){
                if(s[i]==' ' && c){
                   break;
                }
                if(s[i]!=' '){
                     ans++;
                     c++;
                    cout<<ans;
                    
                }
            }
        
        return ans;
    }
};