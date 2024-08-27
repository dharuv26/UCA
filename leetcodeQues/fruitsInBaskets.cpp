class Solution {
public:
    int totalFruit(vector<int>& fruits) {
        if (fruits.size() <= 2)
            return fruits.size();
        unordered_map<int, int> mp;
        int ptr1 = 0;
        int ans = 0;
        for (int ptr2 = 0; ptr2 < fruits.size(); ptr2++) {
            mp[fruits[ptr2]]++;
            if (mp.size() <= 2) {
                ans = max(ans, ptr2 - ptr1 + 1);
            } else {
                while (mp.size() != 2) {
                    mp[fruits[ptr1]]--;
                    if (mp[fruits[ptr1]] == 0)
                        mp.erase(fruits[ptr1]);
                    ptr1++;
                }
            }
        }
        return ans;
    }
};
