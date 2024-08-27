class Solution {
public:
    int candy(vector<int>& ratings) {
        vector<int> v(ratings.size(), 1);
        for(int i = 1; i < ratings.size(); i++){
            if(ratings[i] > ratings[i-1]) v[i] = v[i-1] + 1;
        }
        int ans = 0;
        for(int i = ratings.size()-2; i >= 0; i--){
            if(ratings[i] > ratings[i+1]) v[i] = max(v[i], v[i+1] + 1);
            ans += v[i];
        }
        ans += v[ratings.size()-1];
        return ans;
    }
};
