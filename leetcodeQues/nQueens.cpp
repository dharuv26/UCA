class Solution {
public:

bool isValid(int x, int y, int n,vector<vector<int>> &v){
    for(int i=0;i<x;i++){
        if(v[i][y]==1) return false;
    }
    for(int i=x, j=y; i>=0 && j>=0; i--, j--){
        if(v[i][j]==1) return false;
    }
    for(int i=x, j=y;i>=0 && j<n; i--, j++){
        if(v[i][j]==1) return false;
    }
    return true;
}
void print(vector<vector<string>> &ans, int n,vector<vector<int>> &v){
    vector<string> temp;
    for(int i=0;i<n;i++){
        string t;
        for(int j=0;j<n;j++){
            if(v[i][j]) t.push_back('Q');
            else t.push_back('.');
        }
        temp.push_back(t);
    }
    ans.push_back(temp);
}
void f(int x, int n,  vector<vector<string>> &ans,vector<vector<int>> &v){
    if(x==n){
        print(ans,n,v);
        return;
    }
    for(int i=0;i<n;i++){
        if(isValid(x,i,n,v)){
            v[x][i]=1;
            f(x+1,n,ans,v);
            v[x][i]=0;
        }
    }
    return;
}
    vector<vector<string>> solveNQueens(int n) {
        vector<vector<int>> v(10, vector<int>(10,0));
        vector<vector<string>> ans;
    f(0,n,ans,v);
    return ans;
    }
};
