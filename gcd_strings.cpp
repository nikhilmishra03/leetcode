class Solution {
public:
    string gcdOfStrings(string str1, string str2) {
        string s ;
        if(str1+str2 == str2 + str1){
            s = (str1.substr(0,gcd(size(str1),size(str2))));
        }
        else{
            s = "";
        }
        return s;
        //return (str1 + str2 == str2 + str1)? 
        //str1.substr(0, gcd(size(str1),size(str2))): "";
    }
};